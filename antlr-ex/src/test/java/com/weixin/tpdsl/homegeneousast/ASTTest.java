package com.weixin.tpdsl.homegeneousast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ASTTest {

  private Token one = new Token(Token.INT, "1");
  private Token two = new Token(Token.INT, "2");

  @Test
  void test_ast_nested() {
    Token plus = new Token(Token.PLUS, "+");

    AST root = new AST(plus);
    root.addChild(new AST(one));
    root.addChild(new AST(two));

    String result = root.toStringTree();
    assertEquals(result, "(+ 1 2)");
  }

  @Test
  void test_ast_list() {
    AST list = new AST(); // nil node
    list.addChild(new AST(one));
    list.addChild(new AST(two));

    String result = list.toStringTree();
    assertEquals(result, "1 2");
  }
}