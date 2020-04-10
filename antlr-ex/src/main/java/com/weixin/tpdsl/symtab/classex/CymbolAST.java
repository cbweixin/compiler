package com.weixin.tpdsl.symtab.classex;

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
  // set by Ref.g; point at def in symbol table
  public Symbol symbol;

  public CymbolAST(Token t) {
    super(t);
  }
}
