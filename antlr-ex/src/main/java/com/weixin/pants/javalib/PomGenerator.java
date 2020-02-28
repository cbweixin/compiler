package com.weixin.pants.javalib;

import com.weixin.pants.javalib.gen.PANTSLexer;
import com.weixin.pants.javalib.gen.PANTSParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PomGenerator {
  public void process(InputStream is) throws IOException {
    PANTSLexer lex = new PANTSLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    PANTSParser parser = new PANTSParser(tokens);
    ParseTree tree = parser.pants();

    ParseTreeWalker walker = new ParseTreeWalker();
    JavaLibEmitter emitter = new JavaLibEmitter();
    walker.walk(emitter,tree);
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

    PomGenerator generator = new PomGenerator();
    generator.process(is);


  }


}
