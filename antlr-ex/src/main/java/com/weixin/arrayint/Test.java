package com.weixin.arrayint;

import com.weixin.arrayint.gen.ArrayInitLexer;
import com.weixin.arrayint.gen.ArrayInitParser;
import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {

  public static void main(String[] args) throws IOException {

    // create a lexer that feeds off of input CharStream
    ArrayInitLexer lexer = new ArrayInitLexer(CharStreams.fromStream(System.in));

    // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    // create a parser that feeds off the tokens buffer
    ArrayInitParser parser = new ArrayInitParser(tokens);

    ParseTree tree = parser.init(); // begin parsing at init rule
    System.out.println(tree.toStringTree(parser)); // print LISP-style
  }

}
