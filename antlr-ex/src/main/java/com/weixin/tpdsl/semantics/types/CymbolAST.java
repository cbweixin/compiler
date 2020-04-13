package com.weixin.tpdsl.semantics.types;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class CymbolAST extends CommonTree {

  // set by Def.g; ID lives in which scope?
  public Scope scope;
  // set by Types.g; point at def in symbol table
  public Symbol symbol;
  // The type of an expression; set by Types.g
  public Type evalType;

  public CymbolAST() {
  }

  public CymbolAST(Token t) {
    super(t);
  }

  @Override
  public String toString() {
    String s = super.toString();
    if (evalType != null) {
      return s + '<' + evalType.getName() + '>';
    }
    return s;
  }
}