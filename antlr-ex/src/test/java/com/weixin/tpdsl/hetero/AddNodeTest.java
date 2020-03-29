package com.weixin.tpdsl.hetero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddNodeTest {

  @Test
  public void testAst() {
    Token plus = new Token(Token.PLUS, "+");
    Token one = new Token(Token.INT, "1");
    Token two = new Token(Token.INT, "2");
    ExprNode root = new AddNode(new IntNode(one), plus, new IntNode(two));
    System.out.println(root.toStringTree());
    assertEquals("(+ 1 2)", root.toStringTree());
  }
}