package com.weixin.tpdsl.parsing.llk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LookAheadParserTest {

  @Test
  void list() {
    LookAheadLexer lexer = new LookAheadLexer("[a,b=c,[d,e]]");
    LookAheadParser parser = new LookAheadParser(lexer, 2);

    parser.list();
  }

  @Test
  public void testFail() {
    LookAheadLexer lexer = new LookAheadLexer("[a,b=c,,[d,e]]");
    LookAheadParser parser = new LookAheadParser(lexer, 2);

    assertThrows(java.lang.Error.class, () -> {
      parser.list();
    });


  }


}