package com.weixin.tpdsl.interpreter.register;

import static com.weixin.tpdsl.interpreter.register.Interpreter.load;

import java.io.InputStream;
import org.junit.jupiter.api.Test;

class RegisterInterpreterTest {

  @Test
  public void testTRcode() throws Exception {
    Interpreter interpreter = new Interpreter();
    InputStream input = getClass().getClassLoader().getResourceAsStream("t.rcode");
    load(interpreter, input);
    interpreter.trace = true;
    interpreter.exec();
    interpreter.disassemble();
    interpreter.coredump();
  }

}