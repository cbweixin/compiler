package com.weixin.tpdsl.translate.make;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.io.FileReader;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 * The makefile->makefile.java translator main program
 */
public class Maker {

  public static void main(String[] args) throws Exception {
    String makefileName = args[0];
    FileReader fr = new FileReader(makefileName);
    MakeLexer lex = new MakeLexer(new ANTLRReaderStream(fr));
    CommonTokenStream tokens = new CommonTokenStream(lex);
    JavaGenerator gen = new JavaGenerator(makefileName);
    MakeParser p = new MakeParser(tokens, gen);
    try {
      p.rules();
    } // parse, triggering code generation actions
    catch (RecognitionException e) {
      e.printStackTrace();
    } finally {
      fr.close();
    }
  }
}
