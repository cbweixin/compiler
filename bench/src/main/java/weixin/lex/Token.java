package weixin.lex;

import weixin.exception.BenchException;

public abstract class Token {
    public static final Token EOF = new Token(-1) {
    };
    public static final String EOL = "\\n";

    private int lineNumber;

    protected Token(int line) {
        lineNumber = line;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public int getNumber() {
        throw new BenchException("not a number token");
    }

    public String getText() {
        return "";
    }
}
