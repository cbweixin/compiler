package com.weixin.tpdsl.symtab.monolithic;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import org.antlr.runtime.*;

public class Test {

  public static void main(String[] args) throws Exception {
    // read from filename or stdin
    CharStream input = null;
      if (args.length > 0) {
          input = new ANTLRFileStream(args[0]);
      } else {
          input = new ANTLRInputStream(System.in);
      }
    // create lexer
    CymbolLexer lex = new CymbolLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lex);
    // create parser
    CymbolParser p = new CymbolParser(tokens);
    // create symbol table
    SymbolTable symtab = new SymbolTable();
    // launch parser
    p.compilationUnit(symtab);
    System.out.println("globals: " + symtab.symbols);
  }
}
