package com.learn.basis.asm;

import com.learn.basis.asm.sample.ChangePrintVisitor;
import com.learn.basis.asm.util.FileUtils;
import org.objectweb.asm.*;

/**
 * @author mumu
 * @since 2023/9/10 10:33
 */
public class HelloWorldTransformCore {
    public static void main(String[] args) {
        String relative_path = "com/learn/basis/asm/sample/SimpleHelloWorld.class";
        String filepath = FileUtils.getFilePath(relative_path);
        byte[] bytes1 = FileUtils.readBytes(filepath);
        //（1）构建ClassReader
        ClassReader cr = new ClassReader(bytes1);
        //（2）构建ClassWriter
        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_FRAMES);
        //（3）串连ClassVisitor
        int api = Opcodes.ASM9;
        ClassVisitor cv = new ChangePrintVisitor(api, cw);
        //（4）结合ClassReader和ClassVisitor
        int parsingOptions = ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES;
        cr.accept(cv, parsingOptions);
        //（5）生成byte[]
        byte[] bytes2 = cw.toByteArray();
        FileUtils.writeBytes(filepath, bytes2);
    }
}
