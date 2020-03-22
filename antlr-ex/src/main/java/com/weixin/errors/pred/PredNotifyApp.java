package com.weixin.errors.pred;

import com.weixin.errors.pred.gen.PredNotifyLexer;
import com.weixin.errors.pred.gen.PredNotifyParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PredNotifyApp {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    PredNotifyLexer lexer = new PredNotifyLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    PredNotifyParser parser = new PredNotifyParser(tokenStream);
    ParseTree tree = parser.assign();
    System.out.println("tree = " + tree.toStringTree(parser));

  }
}
