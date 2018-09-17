package weixin.ast;

import java.util.List;


//primary     : "(" expr ")" | NUMBER | IDENTIFIER | STRING
//factor      : "-" primary | primary
//expr        : factor {OP factor}
//block       : "{" [ statement ] {(";" | EOL)[ statement ]} "}"
//statement   : "if" expr block [ "else" block ]
//            | "while" expr block
//            | simple
//program     : [ statement ] (";" | EOL)

public class PrimaryExpr extends ASTList {

    public PrimaryExpr(List<ASTree> list) {
        super(list);
    }

    public static ASTree create(List<ASTree> list) {
        return list.size() == 1 ? list.get(0) : new PrimaryExpr(list);
    }
}
