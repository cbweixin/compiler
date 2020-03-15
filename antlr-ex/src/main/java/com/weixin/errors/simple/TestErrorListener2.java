package com.weixin.errors.simple;

import com.weixin.errors.simple.gen.SimpleLexer;
import com.weixin.errors.simple.gen.SimpleParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class TestErrorListener2 {

  public static class UnderLineListener extends BaseErrorListener{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
        Object offendingSymbol,
        int line, int charPositionInLine,
        String msg,
        RecognitionException e)
    {
      System.err.println("line "+line+":"+charPositionInLine+" "+msg);
      underlineError(recognizer,(Token)offendingSymbol,
          line, charPositionInLine);
    }

    protected void underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionLine) {
      CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
      String input = tokens.getTokenSource().getInputStream().toString();
      System.out.println("input = " + input);
      String[] lines  = input.split("\n");
      String errorLine = lines[line-1];
      System.err.println(errorLine);
      for(int i = 0; i < charPositionLine; i++){
        System.err.print(" ");
      }
      int start = offendingToken.getStartIndex();
      int stop = offendingToken.getStopIndex();
      if(start >= 0 && stop >= 0){
        for(int i = start; i <= stop; i++){
          System.err.println("^");
        }
      }
      System.err.println();
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
      parser.addErrorListener(new UnderLineListener());
      ParseTree tree = parser.prog();
      System.out.println(tree.toStringTree(parser));
    }


  }


}
