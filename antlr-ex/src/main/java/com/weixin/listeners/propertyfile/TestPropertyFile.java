package com.weixin.listeners.propertyfile;

import com.weixin.listeners.propertyfile.gen.PropertyFileBaseListener;
import com.weixin.listeners.propertyfile.gen.PropertyFileLexer;
import com.weixin.listeners.propertyfile.gen.PropertyFileParser;
import com.weixin.listeners.propertyfile.gen.PropertyFileParser.PropContext;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestPropertyFile {

  public static class PropertyFileLoader extends PropertyFileBaseListener {

    Map<String, String> props = new OrderedHashMap<String, String>();

    @Override
    public void exitProp(PropContext ctx) {
      String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
      String value = ctx.STRING().getText();
      System.out.printf("id : %s, value : %s\n", id, value);
      props.put(id, value);
    }
  }

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    PropertyFileLexer lexer = new PropertyFileLexer(CharStreams.fromStream(is));
    CommonTokenStream stream = new CommonTokenStream(lexer);
    PropertyFileParser parser = new PropertyFileParser(stream);
    ParseTree tree = parser.file();

    // create a standard ANTLR parse tree walker
    ParseTreeWalker walker = new ParseTreeWalker();
    // create listener then feed to walker
    PropertyFileLoader loader = new PropertyFileLoader();
    walker.walk(loader, tree);        // walk parse tree
    System.out.println(loader.props); // print results

  }
}
