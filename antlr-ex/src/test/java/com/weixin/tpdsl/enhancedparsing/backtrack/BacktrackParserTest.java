package com.weixin.tpdsl.enhancedparsing.backtrack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BacktrackParserTest {

  @Test
  public void testAssignement() throws RecognitionException {
    BacktrackLexer lexer = new BacktrackLexer("[a,b] = [c,d]");
    BacktrackParser parser = new BacktrackParser(lexer);
    parser.stat(); // begin parsing at rule 'stat'
  }

  @Test
  public void testList() throws RecognitionException {
    BacktrackLexer lexer = new BacktrackLexer("[a,b]");
    BacktrackParser parser = new BacktrackParser(lexer);
    parser.stat(); // begin parsing at rule 'stat'
  }

  @Test
  public void testNestedAssign() throws RecognitionException {
    BacktrackLexer lexer = new BacktrackLexer("[a,b,[c,d,e]] = [c,d,[f,g,g]]");
    BacktrackParser parser = new BacktrackParser(lexer);
    parser.stat(); // begin parsing at rule 'stat'
  }

  @Test
  public void testNestedAssign2() throws RecognitionException {
    BacktrackLexer lexer = new BacktrackLexer("[a,b,[c,d,e]] = [c,d,[f,g]]");
    BacktrackParser parser = new BacktrackParser(lexer);
    parser.stat(); // begin parsing at rule 'stat'
  }

  @Test
  public void testNestedList() throws RecognitionException {
    BacktrackLexer lexer = new BacktrackLexer("[a,b,[c,d]]");
    BacktrackParser parser = new BacktrackParser(lexer);
    parser.stat(); // begin parsing at rule 'stat'
  }

  @Test
  public void testNestedList2() {
    BacktrackLexer lexer = new BacktrackLexer("[a,b,[c,d]");
    BacktrackParser parser = new BacktrackParser(lexer);
    assertThrows(NoViableAltException.class, () -> {
      parser.stat();
    });
  }

  @Test
  public void testParseError() {
    BacktrackLexer lexer = new BacktrackLexer("[a,b]=[c,d");
    BacktrackParser parser = new BacktrackParser(lexer);

    assertThrows(RecognitionException.class, () -> {
      parser.stat(); // begin parsing at rule 'stat'
    });


  }
}