package com.weixin.asmsample2;


import static org.objectweb.asm.Opcodes.ACC_ABSTRACT;
import static org.objectweb.asm.Opcodes.ACC_FINAL;
import static org.objectweb.asm.Opcodes.ASM6;

import java.io.PrintWriter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.util.TraceClassVisitor;

public class EnhanceAdapter extends ClassVisitor {
  private final TraceClassVisitor tracer;


  public EnhanceAdapter(ClassVisitor cv) {
    super(ASM6, cv);
    PrintWriter pw = new PrintWriter(System.out);
    tracer = new TraceClassVisitor(cv, pw);
  }

  @Override
  public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

    final MethodVisitor mv = tracer.visitMethod(access, name, desc, signature, exceptions);
    if (isIgnore(mv, access, name)) {
      return mv;
    }
    return new EnhancerMethodAdapter(mv, access, name, desc);
  }

  @Override
  public void visitEnd() {
    System.out.println(tracer.p.getText());
    super.visitEnd();
  }

  /**
   * 忽略构造方法、类加载初始化方法，final方法和 abstract 方法
   *
   * @param mv
   * @param access
   * @param methodName
   * @return
   */
  private boolean isIgnore(MethodVisitor mv, int access, String methodName) {
    return null == mv
        || isAbstract(access)
        || isFinalMethod(access)
        || "<clinit>".equals(methodName)
        || "<init>".equals(methodName);
  }

  private boolean isAbstract(int access) {
    return (ACC_ABSTRACT & access) == ACC_ABSTRACT;
  }

  private boolean isFinalMethod(int methodAccess) {
    return (ACC_FINAL & methodAccess) == ACC_FINAL;
  }



}
