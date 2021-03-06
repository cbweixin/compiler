package com.weixin.tpdsl.homegeneousast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ASTTest {

  private Token one = new Token(Token.INT, "1");
  private Token two = new Token(Token.INT, "2");
  private Token three = new Token(Token.MUL, "3");

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

  @Test
  void testBuildTree(){
    Token plus = new Token(Token.PLUS, "+");

    AST node = new AST(plus);
    node.addChild(new AST(one));
    node.addChild(new AST(two));

    Token mul = new Token(Token.MUL, "*");

    AST root = new AST(mul);
    root.addChild(node);
    root.addChild(new AST(three));

    String result = root.toStringTree();
    assertEquals(result, "(* (+ 1 2) 3)");

  }
}