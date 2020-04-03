package com.weixin.tpdsl.walking.visitor;


/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
public class PrintVisitor implements VecMathVisitor {

  @Override
  public void visit(AssignNode n) {
    n.id.visit(this);
    System.out.print("=");
    n.value.visit(this);
    System.out.println();
  }

  @Override
  public void visit(StatListNode n) {
    for (StatNode p : n.elements) {
      p.visit(this);
    }
  }

  @Override
  public void visit(PrintNode n) {
    System.out.print("print ");
    n.value.visit(this);
    System.out.println();
  }

  @Override
  public void visit(AddNode n) {
    n.left.visit(this);
    System.out.print("+");
    n.right.visit(this);
  }

  @Override
  public void visit(DotProductNode n) {
    n.left.visit(this);
    System.out.print(".");
    n.right.visit(this);
  }

  @Override
  public void visit(MultNode n) {
    n.left.visit(this);
    System.out.print("*");
    n.right.visit(this);
  }

  @Override
  public void visit(IntNode n) {
    System.out.print(n.toString());
  }

  @Override
  public void visit(VarNode n) {
    System.out.print(n.toString());
  }

  @Override
  public void visit(VectorNode n) {
    System.out.print("[");
    if (n.elements != null) {
      for (int i = 0; i < n.elements.size(); i++) {
        ExprNode child = n.elements.get(i);
        if (i > 0) {
          System.out.print(", ");
        }
        child.visit(this);
      }
    }
    System.out.print("]");
  }
}


