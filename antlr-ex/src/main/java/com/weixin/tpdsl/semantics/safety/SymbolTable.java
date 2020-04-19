package com.weixin.tpdsl.semantics.safety;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.util.List;
import org.antlr.runtime.TokenStream;

public class SymbolTable {

  // arithmetic types defined in order from narrowest to widest
  // user-defined type (struct)
  public static final int tUSER = 0;
  public static final int tBOOLEAN = 1;
  public static final int tCHAR = 2;
  public static final int tINT = 3;
  public static final int tFLOAT = 4;
  public static final int tVOID = 5;

  public static final BuiltInTypeSymbol _boolean =
      new BuiltInTypeSymbol("boolean", tBOOLEAN);
  public static final BuiltInTypeSymbol _char =
      new BuiltInTypeSymbol("char", tCHAR);
  public static final BuiltInTypeSymbol _int =
      new BuiltInTypeSymbol("int", tINT);
  public static final BuiltInTypeSymbol _float =
      new BuiltInTypeSymbol("float", tFLOAT);
  public static final BuiltInTypeSymbol _void =
      new BuiltInTypeSymbol("void", tVOID);

  public CymbolListener listener =
      new CymbolListener() {
        @Override
        public void info(String msg) {
          System.out.println(msg);
        }

        @Override
        public void error(String msg) {
          System.err.println(msg);
        }
      };

  /**
   * arithmetic types defined in order from narrowest to widest
   */
  public static final Type[] indexToType = {
      // 0, 1,        2,     3,    4,      5
      null, _boolean, _char, _int, _float, _void
  };

  /**
   * Map t1 op t2 to result type (_void implies illegal)
   */
  public static final Type[][] arithmeticResultType = new Type[][]{
      /*          struct  boolean  char    int     float,   void */
      /*struct*/  {_void, _void, _void, _void, _void, _void},
      /*boolean*/ {_void, _void, _void, _void, _void, _void},
      /*char*/    {_void, _void, _char, _int, _float, _void},
      /*int*/     {_void, _void, _int, _int, _float, _void},
      /*float*/   {_void, _void, _float, _float, _float, _void},
      /*void*/    {_void, _void, _void, _void, _void, _void}
  };

  public static final Type[][] relationalResultType = new Type[][]{
      /*          struct  boolean char      int       float,    void */
      /*struct*/  {_void, _void, _void, _void, _void, _void},
      /*boolean*/ {_void, _void, _void, _void, _void, _void},
      /*char*/    {_void, _void, _boolean, _boolean, _boolean, _void},
      /*int*/     {_void, _void, _boolean, _boolean, _boolean, _void},
      /*float*/   {_void, _void, _boolean, _boolean, _boolean, _void},
      /*void*/    {_void, _void, _void, _void, _void, _void}
  };

  public static final Type[][] equalityResultType = new Type[][]{
      /*           struct boolean   char      int       float,    void */
      /*struct*/  {_void, _void, _void, _void, _void, _void},
      /*boolean*/ {_void, _boolean, _void, _void, _void, _void},
      /*char*/    {_void, _void, _boolean, _boolean, _boolean, _void},
      /*int*/     {_void, _void, _boolean, _boolean, _boolean, _void},
      /*float*/   {_void, _void, _boolean, _boolean, _boolean, _void},
      /*void*/    {_void, _void, _void, _void, _void, _void}
  };

  /**
   * Indicate whether a type needs a promotion to a wider type. If not null, implies promotion
   * required.  Null does NOT imply error--it implies no promotion.  This works for arithmetic,
   * equality, and relational operators in Cymbol.
   */
  public static final Type[][] promoteFromTo = new Type[][]{
      /*          struct  boolean  char    int     float,   void */
      /*struct*/  {null, null, null, null, null, null},
      /*boolean*/ {null, null, null, null, null, null},
      /*char*/    {null, null, null, _int, _float, null},
      /*int*/     {null, null, null, null, _float, null},
      /*float*/   {null, null, null, null, null, null},
      /*void*/    {null, null, null, null, null, null}
  };

  GlobalScope globals = new GlobalScope();

  /**
   * Need to have token buffer to print out expressions, errors
   */
  TokenStream tokens;

  public SymbolTable(TokenStream tokens) {
    this.tokens = tokens;
    initTypeSystem();
  }

  protected void initTypeSystem() {
    for (Type t : indexToType) {
      if (t != null) {
        globals.define((BuiltInTypeSymbol) t);
      }
    }
  }

  public Type getResultType(Type[][] typeTable, CymbolAST a, CymbolAST b) {
    // type index of left operand
    int ta = a.evalType.getTypeIndex();
    // type index of right operand
    int tb = b.evalType.getTypeIndex();
    // operation result type
    Type result = typeTable[ta][tb];
    if (result == _void) {
      listener.error(text(a) + ", " +
          text(b) + " have incompatible types in " +
          text((CymbolAST) a.getParent()));
    } else {
      a.promoteToType = promoteFromTo[ta][tb];
      b.promoteToType = promoteFromTo[tb][ta];
    }
    return result;
  }

  public Type bop(CymbolAST a, CymbolAST b) {
    return getResultType(arithmeticResultType, a, b);
  }

  public Type relop(CymbolAST a, CymbolAST b) {
    getResultType(relationalResultType, a, b);
    // even if the operands are incompatible, the type of
    // this operation must be boolean
    return _boolean;
  }

  public Type eqop(CymbolAST a, CymbolAST b) {
    getResultType(equalityResultType, a, b);
    return _boolean;
  }

  public Type uminus(CymbolAST a) {
    if (!(a.evalType == _int || a.evalType == _float)) {
      listener.error(text(a) + " must have int/float type in " +
          text((CymbolAST) a.getParent()));
      return _void;
    }
    return a.evalType;
  }

  public Type unot(CymbolAST a) {
    if (a.evalType != _boolean) {
      listener.error(text(a) + " must have boolean type in " +
          text((CymbolAST) a.getParent()));
      // even though wrong, assume result boolean
      return _boolean;
    }
    return a.evalType;
  }

  public Type arrayIndex(CymbolAST id, CymbolAST index) {
    Symbol s = id.scope.resolve(id.getText());
    // annotate AST
    id.symbol = s;
    // ensure it's an array
    if (s.getClass() != VariableSymbol.class ||
        s.type.getClass() != ArrayType.class) {
      listener.error(text(id) + " must be an array variable in " +
          text((CymbolAST) id.getParent()));
      return _void;
    }
    VariableSymbol vs = (VariableSymbol) s;
    // get element type
    Type t = ((ArrayType) vs.type).elementType;
    int texpr = index.evalType.getTypeIndex();
    // promote the index expr if necessary to int
    index.promoteToType = promoteFromTo[texpr][tINT];
    if (!canAssignTo(index.evalType, _int, index.promoteToType)) {
      listener.error(text(index) + " index must have integer type in " +
          text((CymbolAST) id.getParent()));
    }
    return t;
  }

  public Type call(CymbolAST id, List args) {
    Symbol s = id.scope.resolve(id.getText());
    if (s.getClass() != MethodSymbol.class) {
      listener.error(text(id) + " must be a function in " +
          text((CymbolAST) id.getParent()));
      return _void;
    }

    MethodSymbol ms = (MethodSymbol) s;
    id.symbol = ms;
    int i = 0;

    // for each arg
    for (Symbol a : ms.orderedArgs.values()) {
      CymbolAST argAST = (CymbolAST) args.get(i++);

      // get argument expression type and expected type
      Type actualArgType = argAST.evalType;
      Type formalArgType = ((VariableSymbol) a).type;
      int targ = actualArgType.getTypeIndex();
      int tformal = formalArgType.getTypeIndex();

      // do we need to promote argument type to defined type?
      argAST.promoteToType = promoteFromTo[targ][tformal];
      if (!canAssignTo(actualArgType, formalArgType,
          argAST.promoteToType)) {
        listener.error(text(argAST) + ", argument " +
            a.name + ":<" + a.type + "> of " + ms.name +
            "() have incompatible types in " +
            text((CymbolAST) id.getParent()));
      }
    }
    return ms.type;
  }

  public Type member(CymbolAST expr, CymbolAST field) {
    Type type = expr.evalType;
    if (type.getClass() != StructSymbol.class) {
      listener.error(text(expr) + " must have struct type in " +
          text((CymbolAST) expr.getParent()));
      return _void;
    }
    // get scope of left
    StructSymbol scope = (StructSymbol) expr.evalType;
    // resolve ID in scope
    Symbol s = scope.resolveMember(field.getText());
    field.symbol = s;
    // return ID's type
    return s.type;
  }

  // assignnment stuff (arg assignment in call())

  public void declinit(CymbolAST declID, CymbolAST init) {
    // promote expr to decl type?
    int te = init.evalType.getTypeIndex();
    int tdecl = declID.symbol.type.getTypeIndex();
    declID.evalType = declID.symbol.type;
    init.promoteToType = promoteFromTo[te][tdecl];
    if (!canAssignTo(init.evalType, declID.symbol.type,
        init.promoteToType)) {
      listener.error(text(declID) + ", " +
          text(init) + " have incompatible types in " +
          text((CymbolAST) declID.getParent()));
    }
  }

  public void ret(MethodSymbol ms, CymbolAST expr) {
    Type retType = ms.type; // promote return expr to function decl type?
    Type exprType = expr.evalType;
    int texpr = exprType.getTypeIndex();
    int tret = retType.getTypeIndex();
    expr.promoteToType = promoteFromTo[texpr][tret];
    if (!canAssignTo(exprType, retType, expr.promoteToType)) {
      listener.error(text(expr) + ", " +
          ms.name + "():<" + ms.type + "> have incompatible types in " +
          text((CymbolAST) expr.getParent()));
    }
  }

  public void assign(CymbolAST lhs, CymbolAST rhs) {
    int tlhs = lhs.evalType.getTypeIndex(); // promote right to left type?
    int trhs = rhs.evalType.getTypeIndex();
    rhs.promoteToType = promoteFromTo[trhs][tlhs];
    if (!canAssignTo(rhs.evalType, lhs.evalType, rhs.promoteToType)) {
      listener.error(text(lhs) + ", " +
          text(rhs) + " have incompatible types in " +
          text((CymbolAST) lhs.getParent()));
    }
  }

  public void ifstat(CymbolAST cond) {
    if (cond.evalType != _boolean) {
      listener.error("if condition " + text(cond) +
          " must have boolean type in " +
          text((CymbolAST) cond.getParent()));
    }
  }

  public boolean canAssignTo(Type valueType, Type destType, Type promotion) {
    // either types are same or value was successfully promoted
    return valueType == destType || promotion == destType;
  }

  public String text(CymbolAST t) {
    String ts = "";
    if (t.evalType != null) {
      ts = ":<" + t.evalType + ">";
    }
    return tokens.toString(t.getTokenStartIndex(),
        t.getTokenStopIndex()) + ts;
  }

  @Override
  public String toString() {
    return globals.toString();
  }
}
