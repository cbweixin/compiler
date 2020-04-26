package com.weixin.tpdsl.interpreter.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.junit.jupiter.api.Test;

class TreeInterpreterTest {

  /**
   * An adaptor that tells ANTLR to build PieAST nodes
   */
  public static TreeAdaptor pieAdaptor = new CommonTreeAdaptor() {
    @Override
    public Object create(Token token) {
      return new PieAST(token);
    }

    @Override
    public Object dupNode(Object t) {
      if (t == null) {
        return null;
      }
      return create(((PieAST) t).token);
    }

    @Override
    public Object errorNode(TokenStream input, Token start, Token stop,
        RecognitionException e) {
      return new PieErrorNode(input, start, stop, e);
    }
  };

  @Test
  public void testCherryPie() throws IOException, RecognitionException {
    InputStream input = getClass().getClassLoader().getResourceAsStream("cherry.pie");
    Interpreter interp = new Interpreter();
    interp.interp(input);
  }

  @Test
  public void testApplePie() throws IOException, RecognitionException {
    InputStream input = getClass().getClassLoader().getResourceAsStream("apple.pie");
    Interpreter interp = new Interpreter();
    interp.interp(input);
  }

  @Test
  public void testLookupPie() throws IOException, RecognitionException {
    InputStream input = getClass().getClassLoader().getResourceAsStream("lookup.pie");
    Interpreter interp = new Interpreter();
    interp.interp(input);
  }

  @Test
  public void testLoopPie() throws IOException, RecognitionException {
    InputStream input = getClass().getClassLoader().getResourceAsStream("loop.pie");
    Interpreter interp = new Interpreter();
    interp.interp(input);
  }

  @Test
  public void testStructPie() throws IOException, RecognitionException {
    InputStream input = getClass().getClassLoader().getResourceAsStream("struct.pie");
    Interpreter interp = new Interpreter();
    interp.interp(input);
  }

  @Test
  public void testStructErrorPie() throws IOException, RecognitionException {
    InputStream input = getClass().getClassLoader().getResourceAsStream("structerror.pie");
    Interpreter interp = new Interpreter();
    interp.interp(input);
  }
}