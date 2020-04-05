package com.weixin.tpdsl.walking.treegrammar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrinterTest {


  @BeforeEach
  void setUp() throws IOException {

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  public void testTree2Grammaer() throws RecognitionException {
    VecMathLexer lex = new VecMathLexer(new ANTLRStringStream("x = 3 + 4\n" + "print x * [2,3,4]"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser parser = new VecMathParser(tokens);
    // calling start rule
    RuleReturnScope r = parser.prog();

    // get result
    CommonTree tree = (CommonTree) r.getTree();

    assertEquals("(= x (+ 3 4)) (print (* x (VEC 2 3 4)))", tree.toStringTree());

  }


  @Test
  public void testPrintTree() throws RecognitionException {
    VecMathLexer lex = new VecMathLexer(new ANTLRStringStream("x = 3 + 4\n" + "print x * [2,3,4]"));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    VecMathParser parser = new VecMathParser(tokens);
    // calling start rule
    RuleReturnScope r = parser.prog();

    // get result
    CommonTree tree = (CommonTree) r.getTree();
    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
    Printer printer = new Printer(nodes);

    PrintStream stdout = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String expectedOutput = "x = 3+4\nprint x*[2, 3, 4]\n";
    // output would be in baos
    printer.prog();
    String actuOutput = baos.toString().replaceAll("\r","");
    // restore System.out, so we can print to console now
    System.setOut(stdout);
    System.out.println(actuOutput);
    assertEquals(expectedOutput, actuOutput);
  }


}