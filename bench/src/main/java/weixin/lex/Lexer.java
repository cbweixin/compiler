package weixin.lex;

import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Lexer {
    public static String regexPat
            = "\\s*((//.*)|([0-9]+)|(\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\")"
            + "|[A-Z_a-z][A-Z_a-z0-9]*|==|<=|>=|&&|\\|\\||\\p{Punct})?";

    private Pattern pattern = Pattern.compile(regexPat);
    private ArrayList<Token> queue =  new ArrayList<Token>();
    private boolean hasMore;
    private LineNumberReader reader;

    public Lexer(Reader r){
        hasMore = true;
        reader = new LineNumberReader(r);
    }




}
