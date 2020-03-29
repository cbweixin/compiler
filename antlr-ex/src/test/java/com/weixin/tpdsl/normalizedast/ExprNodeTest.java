package com.weixin.tpdsl.normalizedast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExprNodeTest {

  @Test
  void testAst() {
    Token plus = new Token(Token.PLUS, "+");
    Token one = new Token(Token.INT, "1");
    Token two = new Token(Token.INT, "2");

    ExprNode root = new AddNode(new IntNode(one), plus, new IntNode(two));
    String repr = root.toStringTree();

    assertEquals(repr, "(+ 1<type=tINTEGER> 2<type=tINTEGER>)");
  }

}