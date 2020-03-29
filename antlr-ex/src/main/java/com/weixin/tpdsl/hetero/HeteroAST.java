package com.weixin.tpdsl.hetero;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
// Heterogeneous AST node type
public abstract class HeteroAST {

  // Node created from which token?
  Token token;

  public HeteroAST() {
  }

  public HeteroAST(Token t) {
    token = t;
  }

  /**
   * Create node from token type; used mainly for imaginary tokens
   */
  public HeteroAST(int tokenType) {
    this.token = new Token(tokenType);
  }

  /**
   * Compute string for single node
   */
  @Override
  public String toString() {
    return token.toString();
  }

  /**
   * Compute string for a whole tree not just node; default: print token
   */
  public String toStringTree() {
    return toString();
  }
}


