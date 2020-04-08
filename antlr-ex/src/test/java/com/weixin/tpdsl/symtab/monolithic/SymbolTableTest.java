package com.weixin.tpdsl.symtab.monolithic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.jupiter.api.Test;

class SymbolTableTest {

  @Test
  public void testSymbolTable1() throws IOException, RecognitionException {
    CymbolLexer lexer = new CymbolLexer(new ANTLRStringStream("int i = 9;"));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    CymbolParser parser = new CymbolParser(tokenStream);
    // create symbol table
    SymbolTable symtab = new SymbolTable();

    PrintStream stdout = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String expectedOutput = "line 1: ref int\nline 1: def i\n";
    parser.compilationUnit(symtab);
    String actuOutput = baos.toString().replaceAll("\r","");
    System.setOut(stdout);
    System.out.println(actuOutput);
    assertEquals(expectedOutput, actuOutput);
    assertEquals("global:{i=<i:int>, float=float, int=int}", symtab.toString());
  }

  @Test
  public void testSymbolTable2() throws IOException, RecognitionException {
    CymbolLexer lexer = new CymbolLexer(new ANTLRStringStream("float j;"));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    CymbolParser parser = new CymbolParser(tokenStream);
    // create symbol table
    SymbolTable symtab = new SymbolTable();

    PrintStream stdout = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String expectedOutput = "line 1: ref float\nline 1: def j\n";
    parser.compilationUnit(symtab);
    String actuOutput = baos.toString().replaceAll("\r","");
    System.setOut(stdout);
    System.out.println(actuOutput);
    assertEquals(expectedOutput, actuOutput);
    assertEquals("global:{j=<j:float>, float=float, int=int}", symtab.toString());
  }

  @Test
  public void testSymbolTable3() throws IOException, RecognitionException {
    CymbolLexer lexer = new CymbolLexer(new ANTLRStringStream("int k = i + 2;"));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    CymbolParser parser = new CymbolParser(tokenStream);
    // create symbol table
    SymbolTable symtab = new SymbolTable();

    PrintStream stdout = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String expectedOutput = "line 1: ref int\nline 1: ref to null\nline 1: def k\n";
    parser.compilationUnit(symtab);
    String actuOutput = baos.toString().replaceAll("\r","");
    System.setOut(stdout);
    System.out.println(actuOutput);
    assertEquals(expectedOutput, actuOutput);
    assertEquals("global:{k=<k:int>, float=float, int=int}", symtab.toString());
  }
}