package com.weixin.asmsample2;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AdviceAdapter;

public class EnhancerMethodAdapter extends AdviceAdapter {
  private final String name;

  protected EnhancerMethodAdapter(MethodVisitor mv, int access, String name, String desc) {
    super(ASM6, mv, access, name, desc);
    this.name = name;
  }

  /**
   * 方法前置
   */
  @Override
  protected void onMethodEnter() {
    // 前置逻辑 System.out.println("method : " + name + " invoke start...");
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
    mv.visitLdcInsn("method : " + name + " invoke start...");
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
  }

  /**
   * 方法后置
   *
   * @param opcode
   */
  @Override
  protected void onMethodExit(int opcode) {
    // 后置逻辑 System.out.println("method : " + name + " invoke end...");
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
    mv.visitLdcInsn("method : " + name + " invoke end...");
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
    super.onMethodExit(opcode);
  }

}
