package com.weixin.errors.simple;

import com.weixin.errors.simple.gen.SimpleLexer;
import com.weixin.errors.simple.gen.SimpleParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

public class TestErrorListener {

  public static class VerboseListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
        Object offendingSymbol,
        int line, int charPositionInLine,
        String msg,
        RecognitionException e) {
      List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
      String sourceName = ((Parser) recognizer).getSourceName();
      String grammarFileName  = ((Parser) recognizer).getGrammarFileName();
      Collections.reverse(stack);
      System.err.println("source name : " + sourceName);
      System.out.println("grammarFileName = " + grammarFileName);
      System.err.println("rul stack: " + stack);
      System.err.println(
          "line " + line + ":" + charPositionInLine + " at " + offendingSymbol + " : " + msg);
    }
  }

  public static void main(String[] args) throws IOException {

    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    SimpleLexer lexer = new SimpleLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    SimpleParser parser = new SimpleParser(tokenStream);
    parser.removeErrorListeners(); // remove ConsoleErrorListener
    parser.addErrorListener(new VerboseListener());
    ParseTree tree = parser.prog();
//    System.out.println(tree.toStringTree(parser));
  }


}
