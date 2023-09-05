package com.learn.basis.asm.sample;

import com.learn.basis.asm.util.FileUtils;
import com.learn.basis.asm.util.HexFormat;
import com.learn.basis.asm.util.HexUtils;
import com.learn.basis.asm.util.ReadUtils;

/**
 * @author mumu
 * @since 2023/9/5 23:16
 */
public class A_File_Hex {
    public static void main(String[] args) {
        String relativePath = "com/learn/basis/asm/sample/HelloWorld.class";
        String filepath = FileUtils.getFilePath(relativePath);
        byte[] bytes1 = ReadUtils.readByPath(filepath);
        String hexStr = HexUtils.format(bytes1, HexFormat.FORMAT_FF_SPACE_FF_16);
        System.out.println(hexStr);
    }
}
