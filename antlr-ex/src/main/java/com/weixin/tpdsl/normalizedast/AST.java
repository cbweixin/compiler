package com.weixin.tpdsl.normalizedast;

import java.util.ArrayList;
import java.util.List;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

// Homogeneous AST node type
public class AST {

  // From which token did we create node?
  Token token;
  // normalized list of children
  List<AST> children;

  public AST() {
    ;
    // for making nil-rooted nodes
  }

  public AST(Token t) {
    token = t;
  }

  /**
   * Create node from token type; used mainly for imaginary tokens
   */
  public AST(int tokenType) {
    this.token = new Token(tokenType);
  }

  /**
   * External visitors need unique int per node for id purposes while walking.
   */
  public int getNodeType() {
    return token.type;
  }

  public void addChild(AST t) {
    if (children == null) {
      children = new ArrayList<AST>();
    }
    children.add(t);
  }

  public boolean isNil() {
    return token == null;
  }

  /**
   * Compute string for single node
   */
  @Override
  public String toString() {
    return token.toString();
  }

  /**
   * Compute string for a whole tree not just a node
   */
  public String toStringTree() {
    if (children == null || children.size() == 0) {
      return this.toString();
    }
    StringBuilder buf = new StringBuilder();
    if (!isNil()) {
      buf.append("(");
      buf.append(this.toString());
      buf.append(' ');
    }
    for (int i = 0; children != null && i < children.size(); i++) {
      // normalized (unnamed) children
      AST t = (AST) children.get(i);
      if (i > 0) {
        buf.append(' ');
      }
      buf.append(t.toStringTree());
    }
    if (!isNil()) {
      buf.append(")");
    }
    return buf.toString();
  }
}