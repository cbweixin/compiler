package com.weixin.errors.pred;

import com.weixin.errors.pred.gen.PredLexer;
import com.weixin.errors.pred.gen.PredParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PredApp {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    PredLexer lexer = new PredLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PredParser parser = new PredParser(tokens);
    ParseTree tree = parser.assign();
    System.out.println("tree = " + tree.toStringTree(parser));
  }
}
