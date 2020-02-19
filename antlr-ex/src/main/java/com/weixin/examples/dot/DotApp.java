package com.weixin.examples.dot;

import com.weixin.examples.dot.gen.DOTLexer;
import com.weixin.examples.dot.gen.DOTParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class DotApp {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    DOTLexer lexer = new DOTLexer(CharStreams.fromStream(is));
    CommonTokenStream stream = new CommonTokenStream(lexer);
    DOTParser parser = new DOTParser(stream);
    ParseTree tree = parser.graph();
    System.out.println(tree.toStringTree(parser));


  }

}
