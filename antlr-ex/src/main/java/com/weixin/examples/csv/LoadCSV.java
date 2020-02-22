package com.weixin.examples.csv;

import com.weixin.examples.csv.gen.CSVBaseListener;
import com.weixin.examples.csv.gen.CSVLexer;
import com.weixin.examples.csv.gen.CSVParser;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class LoadCSV {

  public static class Loader extends CSVBaseListener {

    public static final String EMPTY = "";
    /**
     * Load a list of row maps that map field name to value
     */
    List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
    /**
     * List of column names
     */
    List<String> header;
    /**
     * Build up a list of fields in current row
     */
    List<String> currentRowFieldValues;

    @Override
    public void exitHdr(CSVParser.HdrContext ctx) {
      header = new ArrayList<String>();
      header.addAll(currentRowFieldValues);
    }

    @Override
    public void enterRow(CSVParser.RowContext ctx) {
      currentRowFieldValues = new ArrayList<String>();
    }

    @Override
    public void exitRow(CSVParser.RowContext ctx) {
      // If this is the header row, do nothing
      // if ( ctx.parent instanceof CSVParser.HdrContext ) return; OR:
      if (ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr) {
        return;
      }
      // It's a data row
      Map<String, String> m = new LinkedHashMap<String, String>();
      int i = 0;
      for (String v : currentRowFieldValues) {
        m.put(header.get(i), v);
        i++;
      }
      rows.add(m);
    }

    @Override
    public void exitString(CSVParser.StringContext ctx) {
      currentRowFieldValues.add(ctx.STRING().getText());
    }

    @Override
    public void exitText(CSVParser.TextContext ctx) {
      currentRowFieldValues.add(ctx.TEXT().getText());
    }

    @Override
    public void exitEmpty(CSVParser.EmptyContext ctx) {
      currentRowFieldValues.add(EMPTY);
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

    CSVLexer lex = new CSVLexer(CharStreams.fromStream(is));
    CommonTokenStream stream = new CommonTokenStream(lex);
    CSVParser parser = new CSVParser(stream);
    ParseTree tree = parser.file();
    Loader listener = new Loader();

    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(listener, tree);
    System.out.println(listener.rows);




  }

}
