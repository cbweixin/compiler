package com.weixin.tpdsl.walking.embeded;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StatListNodeTest {
  private StatListNode statList;

  public static IntNode I(int i) {
    return new IntNode(new Token(Token.INT, String.valueOf(i)));
  }
  @BeforeEach
  public void setUp() {
    List<StatNode> stats = new ArrayList<>();
    AddNode a = new AddNode(I(3), new Token(Token.PLUS), I(4));
    VarNode x = new VarNode(new Token(Token.ID, "x"));
    AssignNode assign = new AssignNode(x, new Token(Token.ASSIGN, "="), a);
    stats.add(assign);

    Token mult = new Token(Token.MULT, "*");
    List<ExprNode> elements = new ArrayList<>();
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

  @Test
  public void printEmbeddedWalkingTest() {
    // get reference for System.out, prepare for restore in future
    PrintStream stdout = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String expectedOutput = "x=3+4\nprint x*[2, 3, 4]\n";
    // output would be in baos
    statList.print();
    String actuOutput = baos.toString().replaceAll("\r","");
    // restore System.out, so we can print to console now
    System.setOut(stdout);
    System.out.println(actuOutput);
    assertEquals(expectedOutput, actuOutput);

  }



}