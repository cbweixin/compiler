package com.weixin.errors.call;

import com.weixin.errors.call.gen.CallLexer;
import com.weixin.errors.call.gen.CallParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class CallApp {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    CallLexer lexer = new CallLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    CallParser parser = new CallParser(tokenStream);
    ParseTree tree = parser.fcall();
    System.out.println("tree = " + tree.toStringTree(parser));
  }
}
