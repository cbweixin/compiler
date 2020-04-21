package com.weixin.tpdsl.interpreter.syntax;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.RecognitionException;
import org.junit.jupiter.api.Test;

class InterpreterTest {

  @Test
  public void SqlInterpreterTest1() throws IOException, RecognitionException {

    InputStream input = getClass().getClassLoader().getResourceAsStream("t.q");
    Interpreter interp = new Interpreter();
    interp.interp(input);
  }

}