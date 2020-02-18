package com.weixin.examples.csv;

import com.weixin.examples.csv.gen.CSVLexer;
import com.weixin.examples.csv.gen.CSVParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {

  public static void main(String[] args) throws IOException {
    String inputFile = null;
    if (args.length > 0) {
      inputFile = args[0];
    }
    InputStream is = System.in;
    if (inputFile != null) {
      is = new FileInputStream(inputFile);
    }

    CSVLexer lex = new CSVLexer(CharStreams.fromStream(is));
    CommonTokenStream stream = new CommonTokenStream(lex);
    CSVParser parser = new CSVParser(stream);
    ParseTree tree = parser.file();

    System.out.println(tree.toStringTree(parser));


  }

}
