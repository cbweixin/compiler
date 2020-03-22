package com.weixin.errors.vecmsg;

import com.weixin.errors.vecmsg.gen.VecMsgLexer;
import com.weixin.errors.vecmsg.gen.VecMsgParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class VecMsgApp {
  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    VecMsgLexer lexer = new VecMsgLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    VecMsgParser parser = new VecMsgParser(tokenStream);
    ParseTree tree = parser.vec4();
    System.out.println("tree = " + tree.toStringTree(parser));

  }

}
