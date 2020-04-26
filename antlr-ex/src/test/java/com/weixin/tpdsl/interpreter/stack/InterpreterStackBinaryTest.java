package com.weixin.tpdsl.interpreter.stack;

import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

class InterpreterStackBinaryTest {

  public static boolean load(Interpreter interp, InputStream input) throws Exception {
    boolean hasErrors = false;
    try {
      AssemblerLexer assemblerLexer =
          new AssemblerLexer(new ANTLRInputStream(input));
      CommonTokenStream tokens = new CommonTokenStream(assemblerLexer);
      BytecodeAssembler assembler =
          new BytecodeAssembler(tokens, BytecodeDefinition.instructions);
      assembler.program();
      interp.code = assembler.getMachineCode();
      interp.codeSize = assembler.getCodeMemorySize();
      interp.constPool = assembler.getConstantPool();
      interp.mainFunction = assembler.getMainFunction();
      interp.globals = new Object[assembler.getDataSize()];
      interp.disasm = new DisAssembler(interp.code,
          interp.codeSize,
          interp.constPool);
      hasErrors = assembler.getNumberOfSyntaxErrors() > 0;
    } finally {
      input.close();
    }
    return hasErrors;
  }

  @Test
  public void testTPcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t0.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }


  @Test
  public void testT1Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t1.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testT2Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t2.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testT3Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t3.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testT4Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t4.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testT5Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t5.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testT6Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t6.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testT7Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t7.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testT8Pcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("t8.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testStructPcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("struct.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testLoopPcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("loop.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

  @Test
  public void testFactorialPcode() throws Exception {
    InputStream input = getClass().getClassLoader().getResourceAsStream("factorial.pcode");
    Interpreter interpreter = new Interpreter();
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

}