package com.weixin.tpdsl.walking.visitor;

import static org.junit.jupiter.api.Assertions.*;

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
    PrintVisitor visitor = new PrintVisitor();
    statList.visit(visitor);
  }

  @Test
  public void independentPrintVisitorTest() {
    IndependentPrintVisitor visitor = new IndependentPrintVisitor();
    visitor.print(statList);
  }



  public static IntNode I(int i) {
    return new IntNode(new Token(Token.INT, String.valueOf(i)));
  }
}