package com.learn.basis.asm.sample;

import com.learn.basis.asm.util.FileUtils;
import com.learn.basis.asm.util.HexFormat;
import com.learn.basis.asm.util.HexUtils;
import com.learn.basis.asm.util.ReadUtils;

/**
 * @author mumu
 * @since 2023/9/5 23:16
 */
public class B_File_Raw {
    public static void main(String[] args) {
        String relativePath = "com/learn/basis/asm/sample/HelloWorld.class";
        String filepath = FileUtils.getFilePath(relativePath);
        byte[] bytes1 = ReadUtils.readByPath(filepath);


    }
}
