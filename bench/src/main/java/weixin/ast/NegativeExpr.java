package weixin.ast;

import java.util.List;

public class NegativeExpr extends ASTList {
    public NegativeExpr(List<ASTree> list) {
        super(list);
    }

    public ASTree operand() {
        return child(0);
    }

    @Override
    public String toString() {
        return "-" + operand();
    }
}
