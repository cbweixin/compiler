package com.weixin.examples.json;

import com.weixin.examples.json.gen.JSONLexer;
import com.weixin.examples.json.gen.JSONParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    JSONLexer lexer = new JSONLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    JSONParser parser = new JSONParser(tokenStream);
    ParseTree tree = parser.json();
    System.out.println(tree.toStringTree(parser));

  }

}
