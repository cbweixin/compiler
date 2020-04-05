package com.weixin.tpdsl.walking.patternmatch;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class Test {

  public static void main(String[] args) throws Exception {
    CharStream input = null;
    if (args.length > 0) {
      input = new ANTLRStringStream(args[0]);
    } else {
      input = new ANTLRInputStream(System.in);
    }
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    // Traverse tree down then up, applying rewrite rules
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Simplify s = new Simplify(nodes);
    // walk t, trace transforms
    t = (CommonTree) s.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
  }
}
