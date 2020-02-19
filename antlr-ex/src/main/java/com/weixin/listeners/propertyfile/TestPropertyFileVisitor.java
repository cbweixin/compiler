package com.weixin.listeners.propertyfile;

import com.weixin.listeners.propertyfile.gen.PropertyFileBaseVisitor;
import com.weixin.listeners.propertyfile.gen.PropertyFileLexer;
import com.weixin.listeners.propertyfile.gen.PropertyFileParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class TestPropertyFileVisitor {

  public static class PropertyFileVisitor extends
      PropertyFileBaseVisitor<Void>
  {
    Map<String,String> props = new OrderedHashMap<String, String>();
    @Override
    public Void visitProp(PropertyFileParser.PropContext ctx) {
      String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
      String value = ctx.STRING().getText();
      props.put(id, value);
      return null; // Java says must return something even when Void
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

    PropertyFileVisitor loader = new PropertyFileVisitor();
    loader.visit(tree);
    System.out.println(loader.props);


  }


}
