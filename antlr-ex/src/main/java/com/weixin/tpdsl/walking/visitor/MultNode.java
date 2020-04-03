package com.weixin.tpdsl.walking.visitor;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
public class MultNode extends ExprNode {
  // named, node-specific, irregular children
  ExprNode left, right;
  public MultNode(ExprNode left, Token t, ExprNode right) {
    super(t);
    this.left = left;
    this.right = right;
  }
  @Override
  public void visit(VecMathVisitor visitor) { visitor.visit(this); }
}



