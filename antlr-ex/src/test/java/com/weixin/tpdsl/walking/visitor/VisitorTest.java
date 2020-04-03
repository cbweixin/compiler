package com.weixin.tpdsl.walking.visitor;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VisitorTest {

  private StatListNode statList;


  @BeforeEach
  void setUp() {
    // x = 3+4
    List<StatNode> stats = new ArrayList<StatNode>();
    AddNode a = new AddNode(I(3), new Token(Token.PLUS), I(4));
    VarNode x = new VarNode(new Token(Token.ID, "x"));
    AssignNode assign = new AssignNode(x, new Token(Token.ASSIGN, "="), a);
    stats.add(assign);
    // print x * [2, 3, 4]
    Token mult = new Token(Token.MULT, "*");
    List<ExprNode> elements = new ArrayList<ExprNode>();
    elements.add(I(2));
    elements.add(I(3));
    elements.add(I(4));
    VectorNode v = new VectorNode(new Token(Token.VEC), elements);
    VarNode xref = new VarNode(new Token(Token.ID, "x"));
    ExprNode pv = new MultNode(xref, mult, v);
    PrintNode p = new PrintNode(new Token(Token.PRINT, "print"), pv);
    stats.add(p);
    statList = new StatListNode(stats);
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  public void printVisitorTest() {
    // get reference for System.out, prepare for restore in future
    PrintStream stdout = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String expectedOutput = "x=3+4\nprint x*[2, 3, 4]\n";
    PrintVisitor visitor = new PrintVisitor();
    // output would be in baos
    statList.visit(visitor);
    // restore System.out, so we can print to console now
    String actuOutput = baos.toString().replaceAll("\r","");
    System.setOut(stdout);
    System.out.println(actuOutput);
    assertEquals(expectedOutput, actuOutput);
  }

  @Test
  public void independentPrintVisitorTest() {
    PrintStream stdout = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String expectedOutput = "x=3+4\nprint x*[2, 3, 4]\n";
    IndependentPrintVisitor visitor = new IndependentPrintVisitor();
    visitor.print(statList);
    // restore System.out, so we can print to console now
    String actuOutput = baos.toString().replaceAll("\r","");
    System.setOut(stdout);
    System.out.println(actuOutput);
    assertEquals(expectedOutput, actuOutput);
  }



  public static IntNode I(int i) {
    return new IntNode(new Token(Token.INT, String.valueOf(i)));
  }
}