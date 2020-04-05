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

class SimplifyTest {

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  public void testVecMul1() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(
        new ANTLRStringStream("x = 4 * [0,3*4,0*5]"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* 4 (VEC 0 (* 3 4) (* 0 5))))", t.toStringTree(), "original tree value ");
    // Traverse tree down then up, applying rewrite rules
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Simplify s = new Simplify(nodes);
    // walk t, trace transforms
    t = (CommonTree) s.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (VEC 0 (* 4 (* 3 4)) 0))", t.toStringTree());

  }

  @Test
  public void testVecMul2() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(
        new ANTLRStringStream("x = [0,3*4,0*5] * 3"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* (VEC 0 (* 3 4) (* 0 5)) 3))", t.toStringTree(), "original tree value ");
    // Traverse tree down then up, applying rewrite rules
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Simplify s = new Simplify(nodes);
    // walk t, trace transforms
    t = (CommonTree) s.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (* (VEC 0 (* 3 4) 0) 3))", t.toStringTree());

  }

  @Test
  public void testVecMul3() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(
        new ANTLRStringStream("x = 0 * [0,3*4,0*5]"));

    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* 0 (VEC 0 (* 3 4) (* 0 5))))", t.toStringTree(), "original tree value ");
    // Traverse tree down then up, applying rewrite rules
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Simplify s = new Simplify(nodes);
    // walk t, trace transforms
    t = (CommonTree) s.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (VEC 0 (* 0 (* 3 4)) 0))", t.toStringTree());

  }

  @Test
  public void testVecMul4() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(
        new ANTLRStringStream("x = [0,3*4,0*5] * 0"));

    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* (VEC 0 (* 3 4) (* 0 5)) 0))", t.toStringTree(), "original tree value ");
    // Traverse tree down then up, applying rewrite rules
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Simplify s = new Simplify(nodes);
    // walk t, trace transforms
    t = (CommonTree) s.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (* (VEC 0 (* 3 4) 0) 0))", t.toStringTree());

  }

  @Test
  public void testVecMul5() throws RecognitionException {
    // Create lexer/parser to build trees from stdin
    VecMathLexer lex = new VecMathLexer(
        new ANTLRStringStream("x = 3 *[0,3*4,0*5] * 0"));

    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser p = new VecMathParser(tokens);
    // launch parser by calling start rule
    RuleReturnScope r = p.prog();
    // get tree result
    CommonTree t = (CommonTree) r.getTree();

    System.out.println("Original tree: " + t.toStringTree());
    assertEquals("(= x (* (* 3 (VEC 0 (* 3 4) (* 0 5))) 0))", t.toStringTree(),
        "original tree value ");
    // Traverse tree down then up, applying rewrite rules
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
    Simplify s = new Simplify(nodes);
    // walk t, trace transforms
    t = (CommonTree) s.downup(t, true);
    System.out.println("Simplified tree: " + t.toStringTree());
    assertEquals("(= x (* (VEC 0 (* 3 (* 3 4)) 0) 0))", t.toStringTree());

  }
}
