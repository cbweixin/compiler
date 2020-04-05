package com.weixin.tpdsl.walking.patternmatch;

import static org.junit.jupiter.api.Assertions.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReduceTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  public void testRedue1() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(new ANTLRStringStream("x = 2 * (3+3)"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* 2 (+ 3 3)))", t.toStringTree());
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Reduce red = new Reduce(nodes);
    // walk t, trace transforms
    t = (CommonTree) red.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (<< 3 2))", t.toStringTree());
  }

  @Test
  public void testRedue2() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(new ANTLRStringStream("x = 4 * (3+3)"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* 4 (+ 3 3)))", t.toStringTree());
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Reduce red = new Reduce(nodes);
    // walk t, trace transforms
    t = (CommonTree) red.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (* 4 (<< 3 1)))", t.toStringTree());
  }

  @Test
  public void testRedue3() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(new ANTLRStringStream("x = 2 * (3+3+3+3)"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* 2 (+ (+ (+ 3 3) 3) 3)))", t.toStringTree());
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Reduce red = new Reduce(nodes);
    // walk t, trace transforms
    t = (CommonTree) red.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (<< (+ (+ (<< 3 1) 3) 3) 1))", t.toStringTree());
  }
}