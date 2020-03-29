package com.weixin.tpdsl.enhancedparsing.memoize;

import static org.junit.jupiter.api.Assertions.*;

import com.weixin.tpdsl.enhancedparsing.backtrack.RecognitionException;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BacktrackParserTest {

  @Test
  public void testMemoizing() throws RecognitionException {
    PrintStream stdout = System.out;
    // save output to stdout
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    String str = "[a,b]=[c,d]";
    BacktrackLexer lexer = new BacktrackLexer(str);
    BacktrackParser parser = new BacktrackParser(lexer);

    parser.stat();

    String expectedOutput = "attempt alternative 1\nparse list rule at token index: 0\nattempt alternative 2\nparsed list before at index 0; skip ahead to token index 5: =\nparse list rule at token index: 6\npredict alternative 2\nparse list rule at token index: 0\nparse list rule at token index: 6\n";
    System.setOut(stdout);
    String actualOutput = baos.toString().replaceAll("\r", "");
    System.out.print(actualOutput);
    assertEquals(expectedOutput, actualOutput);
  }
}