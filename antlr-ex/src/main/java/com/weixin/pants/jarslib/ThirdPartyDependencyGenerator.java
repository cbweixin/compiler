package com.weixin.pants.jarslib;

import com.weixin.pants.jarslib.gen.JarsLibLexer;
import com.weixin.pants.jarslib.gen.JarsLibParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ThirdPartyDependencyGenerator {
  public void process(InputStream is) throws IOException {
    JarsLibLexer lex = new JarsLibLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    JarsLibParser parser = new JarsLibParser(tokens);
    ParseTree tree = parser.jarslib();

    ParseTreeWalker walker = new ParseTreeWalker();
    JarDependentEmitter emitter = new JarDependentEmitter();
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
    ThirdPartyDependencyGenerator generator = new ThirdPartyDependencyGenerator();
    generator.process(is);

  }

}