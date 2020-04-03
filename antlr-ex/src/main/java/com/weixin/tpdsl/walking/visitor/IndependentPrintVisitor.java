package com.weixin.tpdsl.walking.visitor;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/
public class IndependentPrintVisitor {

  // visitor dispatch according to node token type
  public void print(VecMathNode n) {
    switch (n.token.type) {
      case Token.ID:
        print((VarNode) n);
        break;
      case Token.ASSIGN:
        print((AssignNode) n);
        break;
      case Token.PRINT:
        print((PrintNode) n);
        break;
      case Token.PLUS:
        print((AddNode) n);
        break;
      case Token.MULT:
        print((MultNode) n);
        break;
      case Token.DOT:
        print((DotProductNode) n);
        break;
      case Token.INT:
        print((IntNode) n);
        break;
      case Token.VEC:
        print((VectorNode) n);
        break;
      case Token.STAT_LIST:
        print((StatListNode) n);
        break;
      default:
        // catch unhandled node types
        throw new UnsupportedOperationException("Node " +
            n.getClass().getName() + " not handled");
    }
  }

  public void print(StatListNode n) {
    for (StatNode p : n.elements) {
      print(p);
    }
  }

  public void print(AssignNode n) {
    // walk left child
    print(n.id);
    // print operator
    System.out.print("=");
    // walk right child
    print(n.value);
    // print newline
    System.out.println();
  }

  public void print(PrintNode n) {
    System.out.print("print ");
    print(n.value);
    System.out.println();
  }

  public void print(AddNode n) {
    // walk left child
    print(n.left);
    // print operator
    System.out.print("+");
    // walk right child
    print(n.right);
  }

  public void print(DotProductNode n) {
    print(n.left);
    System.out.print(".");
    print(n.right);
  }

  public void print(MultNode n) {
    print(n.left);
    System.out.print("*");
    print(n.right);
  }

  public void print(IntNode n) {
    System.out.print(n.toString());
  }

  public void print(VarNode n) {
    System.out.print(n.toString());
  }

  public void print(VectorNode n) {
    System.out.print("[");
    if (n.elements != null) {
      for (int i = 0; i < n.elements.size(); i++) {
        ExprNode child = n.elements.get(i);
        if (i > 0) {
          System.out.print(", ");
        }
        print(child);
      }
    }
    System.out.print("]");
  }
}
