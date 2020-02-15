package com.weixin.arrayint;

import com.weixin.arrayint.gen.ArrayInitLexer;
import com.weixin.arrayint.gen.ArrayInitParser;
import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translate {

  public static void main(String[] args) throws IOException {

    // create a lexer that feeds off of input CharStream
    ArrayInitLexer lexer = new ArrayInitLexer(CharStreams.fromStream(System.in));

    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    // create a parser that feeds off the tokens buffer
    ArrayInitParser parser = new ArrayInitParser(tokens);

    ParseTree tree = parser.init(); // begin parsing at init rule
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new ShortToUniCodeString(),tree);
    System.out.printf("\n");
  }

}
