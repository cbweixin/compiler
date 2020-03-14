package com.weixin.errors.simple;

import com.weixin.errors.simple.gen.SimpleLexer;
import com.weixin.errors.simple.gen.SimpleParser;
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

    SimpleLexer lexer = new SimpleLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SimpleParser parser = new SimpleParser(tokenStream);
    ParseTree tree = parser.prog();
    System.out.println(tree.toStringTree(parser));

  }

}
