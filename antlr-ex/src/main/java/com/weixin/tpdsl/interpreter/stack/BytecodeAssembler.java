package com.weixin.tpdsl.interpreter.stack;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
 ***/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

/**
 * Subclass the AssemblerParser to actually implement the necessary symbol table management and code
 * generation functions.
 */
public class BytecodeAssembler extends AssemblerParser {

  // initial code memory size
  public static final int INITIAL_CODE_SIZE = 1024;
  // That dictionary maps instruction names to integer byte-codes
  protected Map<String, Integer> instructionOpcodeMapping =
      new HashMap<String, Integer>();
  // label scope
  protected Map<String, LabelSymbol> labels =
      new HashMap<String, LabelSymbol>();
  /**
   * All float and string literals have unique int index in constant pool. We put FunctionSymbols in
   * here too.
   */
  protected List<Object> constPool = new ArrayList<Object>();
  // Instruction address pointer; used to fill code
  protected int ip = 0;
  // code memory
  protected byte[] code = new byte[INITIAL_CODE_SIZE];
  // set via .globals
  protected int dataSize;
  protected FunctionSymbol mainFunction;

  /**
   * Create an assembler attached to a lexer and define the instruction set.
   */
  public BytecodeAssembler(TokenStream lexer,
      BytecodeDefinition.Instruction[] instructions) {
    super(lexer);
    for (int i = 1; i < instructions.length; i++) {
      instructionOpcodeMapping.put(instructions[i].name.toLowerCase(), i);
    }
  }

  public byte[] getMachineCode() {
    return code;
  }

  public int getCodeMemorySize() {
    return ip;
  }

  public int getDataSize() {
    return dataSize;
  }

  /**
   * Return the address associated with label "main:" if defined
   */
  public FunctionSymbol getMainFunction() {
    return mainFunction;
  }

  /**
   * Generate code for an instruction with no operands
   */
  @Override
  protected void gen(Token instrToken) {
    //System.out.println("Gen "+instrToken);
    String instrName = instrToken.getText();
    Integer opcodeI = instructionOpcodeMapping.get(instrName);
    if (opcodeI == null) {
      System.err.println("line " + instrToken.getLine() +
          ": Unknown instruction: " + instrName);
      return;
    }
    int opcode = opcodeI.intValue();
    ensureCapacity(ip + 1);
    // notice in BytecodeDefinition,we have
    // public static final short INSTR_IADD = 1;
    // notice opcode is short type, which 16 bits, 2 byte,  , but int is 32 bits , ie 4 bytes
    // so we need to use mask 0xFF? but 0xFF is only 8 bits. how to handle 16 bits?
    // as we know, the opcode range is from 0 -> 25, which is falls within [0, 2^8 -1], also
    // in java , `&` only applied to `int` , `byte` is signed type, `& 0xFF` retrive the unsigned
    // value , also related to value promotion, see this link :
    // https://stackoverflow.com/questions/11380062/what-does-value-0xff-do-in-java
    code[ip++] = (byte) (opcode & 0xFF);
  }

  /**
   * Generate code for an instruction with one operand
   */
  @Override
  protected void gen(Token instrToken, Token operandToken) {
    gen(instrToken);
    genOperand(operandToken);
  }

  @Override
  protected void gen(Token instrToken, Token oToken1, Token oToken2) {
    gen(instrToken, oToken1);
    genOperand(oToken2);
  }

  @Override
  protected void gen(Token instrToken, Token oToken1, Token oToken2, Token oToken3) {
    gen(instrToken, oToken1, oToken2);
    genOperand(oToken3);
  }

  protected void genOperand(Token operandToken) {
    String text = operandToken.getText();
    int v = 0;
    // switch on token type
    switch (operandToken.getType()) {
      case INT:
        v = Integer.valueOf(text);
        break;
      case CHAR:
        v = Character.valueOf(text.charAt(1));
        break;
      case FLOAT:
        v = getConstantPoolIndex(Float.valueOf(text));
        break;
      case STRING:
        v = getConstantPoolIndex(text);
        break;
      case ID:
        v = getLabelAddress(text);
        break;
      case FUNC:
        v = getFunctionIndex(text);
        break;
      case REG:
        v = getRegisterNumber(operandToken);
        break;
    }
    // expand code array if necessary
    ensureCapacity(ip + 4);
    // write operand to code byte array
    writeInt(code, ip, v);
    // we've written four bytes
    ip += 4;
  }

  protected int getConstantPoolIndex(Object o) {
    if (constPool.contains(o)) {
      return constPool.indexOf(o);
    }
    constPool.add(o);
    return constPool.size() - 1;
  }

  public Object[] getConstantPool() {
    return constPool.toArray();
  }

  // convert "rN" -> N
  protected int getRegisterNumber(Token rtoken) {
    String rs = rtoken.getText();
    rs = rs.substring(1);
    return Integer.valueOf(rs);
  }

  /**
   * After parser is complete, look for unresolved labels
   */
  @Override
  protected void checkForUnresolvedReferences() {
    for (String name : labels.keySet()) {
      LabelSymbol sym = (LabelSymbol) labels.get(name);
      if (!sym.isDefined) {
        System.err.println("unresolved reference: " + name);
      }
    }
  }

  /**
   * Compute the code address of a label
   */
  protected int getLabelAddress(String id) {
    LabelSymbol sym = (LabelSymbol) labels.get(id);
    if (sym == null) {
      // assume it's a forward code reference; record opnd address
      sym = new LabelSymbol(id, ip, true);
      sym.isDefined = false;
      // add to symbol table
      labels.put(id, sym);
    } else {
      if (sym.isForwardRef) {
        // address is unknown, must simply add to forward ref list
        // record where in code memory we should patch later
        sym.addForwardReference(ip);
      } else {
        // all is well; it's defined--just grab address
        return sym.address;
      }
    }
    // we don't know the real address yet
    return 0;
  }

  @Override
  protected void defineFunction(Token idToken, int args, int locals) {
    String name = idToken.getText();
    FunctionSymbol f = new FunctionSymbol(name, args, locals, ip);
    if (name.equals("main")) {
      mainFunction = f;
    }
    // Did someone referred to this function before it was defined?
    // if so, replace element in constant pool (at same index)
    if (constPool.contains(f)) {
      constPool.set(constPool.indexOf(f), f);
    } else {
      // save into constant pool
      getConstantPoolIndex(f);
    }
  }

  protected int getFunctionIndex(String id) {
    int i = constPool.indexOf(new FunctionSymbol(id));
    if (i >= 0) {
      // already in system; return index.
      return i;
    }
    // must be a forward function reference
    // create the constant pool entry; we'll fill in later
    return getConstantPoolIndex(new FunctionSymbol(id));
  }

  @Override
  protected void defineDataSize(int n) {
    dataSize = n;
  }

  @Override
  protected void defineLabel(Token idToken) {
    String id = idToken.getText();
    LabelSymbol sym = (LabelSymbol) labels.get(id);
    if (sym == null) {
      LabelSymbol csym = new LabelSymbol(id, ip, false);
      // add to symbol table
      labels.put(id, csym);
    } else {
      if (sym.isForwardRef) {
        // we have found definition of forward
        sym.isDefined = true;
        sym.address = ip;
        sym.resolveForwardReferences(code);
      } else {
        // redefinition of symbol
        System.err.println("line " + idToken.getLine() +
            ": redefinition of symbol " + id);
      }
    }
  }

  protected void ensureCapacity(int index) {
    if (index >= code.length) { // expand
      int newSize = Math.max(index, code.length) * 2;
      byte[] bigger = new byte[newSize];
      System.arraycopy(code, 0, bigger, 0, code.length);
      code = bigger;
    }
  }

  public static int getInt(byte[] memory, int index) {
    int b1 = memory[index++] & 0xFF; // mask off sign-extended bits
    int b2 = memory[index++] & 0xFF;
    int b3 = memory[index++] & 0xFF;
    int b4 = memory[index++] & 0xFF;
    int word = b1 << (8 * 3) | b2 << (8 * 2) | b3 << (8 * 1) | b4;
    return word;
  }

  /**
   * Write value at index into a byte array highest to lowest byte, left to right.
   */
  public static void writeInt(byte[] bytes, int index, int value) {
    bytes[index + 0] = (byte) ((value >> (8 * 3)) & 0xFF); // get highest byte
    bytes[index + 1] = (byte) ((value >> (8 * 2)) & 0xFF);
    bytes[index + 2] = (byte) ((value >> (8 * 1)) & 0xFF);
    bytes[index + 3] = (byte) (value & 0xFF);
  }
}
