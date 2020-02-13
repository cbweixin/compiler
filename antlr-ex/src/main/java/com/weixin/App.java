package com.weixin;

import com.weixin.gen.DatesLexer;
import com.weixin.gen.DatesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        DatesLexer lexer = new DatesLexer(CharStreams.fromString("01.01."));
        DatesParser parser = new DatesParser(new CommonTokenStream(lexer));
        DatesParser.RContext parsed = parser.r();
        for(DatesParser.ElementContext e : parsed.element())
        {
            System.out.println(e.singledate().date().day().getText());
        }
        System.out.println( "Hello World!" );
    }
}
