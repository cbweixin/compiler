package com.weixin.tour.xmllexer;

import com.weixin.tour.xmllexer.gen.XMLLexer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class XMLApp {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    XMLLexer lexer = new XMLLexer(CharStreams.fromStream(is));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    System.out.println("get tokens");
    for (Token t : tokens.getTokens()) {
      System.out.format("%d %d %d, %d, %s\n ", t.getStartIndex(), t.getStopIndex(), t.getLine(),
          t.getTokenIndex(), t.getText());
    }


  }

}
