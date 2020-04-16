package com.weixin.actions.csv;

import com.weixin.actions.csv.gen.CSVLexer;
import com.weixin.actions.csv.gen.CSVParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class CSVActions {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }
    CSVLexer lexer = new CSVLexer(CharStreams.fromStream(is));
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    CSVParser parser = new CSVParser(tokenStream);
    ParseTree tree = parser.file();
//    System.out.println("tree = " + tree.toStringTree(parser));

  }

}
