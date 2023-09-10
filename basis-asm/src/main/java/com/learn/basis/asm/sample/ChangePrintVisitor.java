package com.learn.basis.asm.sample;

import org.objectweb.asm.*;

/**
 * @author mumu
 * @since 2023/9/10 10:34
 */
public class ChangePrintVisitor extends ClassVisitor {

    public ChangePrintVisitor(int api, ClassVisitor classVisitor) {
        super(api, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
        if (mv != null && !"<init>".equals(name)) {
            mv = new ChangePrintAdaptor(api, mv);
        }
        return mv;
    }

    private static class ChangePrintAdaptor extends MethodVisitor {
        public ChangePrintAdaptor(int api, MethodVisitor mv) {
            super(api, mv);
        }

        @Override
        public void visitLdcInsn(Object value) {
            if ("Hello World".equals(value)) {
                super.visitLdcInsn("Good Morning");
            } else {
                super.visitLdcInsn(value);
            }
        }
    }
}
