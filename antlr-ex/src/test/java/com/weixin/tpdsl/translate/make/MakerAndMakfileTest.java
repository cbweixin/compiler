package com.weixin.tpdsl.translate.make;

import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.jupiter.api.Test;

class MakerAndMakfileTest {

  public MakeParser getParser(String fileName) throws IOException {
    InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
    MakeLexer lexer = new MakeLexer(new ANTLRInputStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    JavaGenerator gen = new JavaGenerator(fileName+"Gen");
    MakeParser p = new MakeParser(tokens,gen);
    return p;

  }

  @Test
  public void testGenerateJavaClass(){
    try{
      MakeParser p = getParser("makefile1");
      p.rules();
    } catch (RecognitionException | IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void runGeneratedClass() throws Exception {
    // the above test already generate a class named `makefile1Gen`
    // it generated at the project root folder, check the commit historyt
    // I manually move it to the test folder and change the package name
    makefile1Gen m = new makefile1Gen();
    m.build("go");
  }

}