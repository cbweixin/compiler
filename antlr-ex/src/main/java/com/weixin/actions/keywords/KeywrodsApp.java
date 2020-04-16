package com.weixin.actions.keywords;

import com.weixin.actions.keywords.gen.KeywordsLexer;
import com.weixin.actions.keywords.gen.KeywordsParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class KeywrodsApp {

  public static void main(String[] args) throws IOException {

    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    KeywordsLexer lexer = new KeywordsLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    KeywordsParser parser = new KeywordsParser(tokenStream);
    ParseTree tree = parser.stat();
    System.out.println("tree = " + tree.toStringTree(parser));

  }

}
