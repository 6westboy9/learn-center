package com.learn.basis.asm.sample;

import java.io.Serializable;

/**
 * @author mumu
 * @since 2023/9/5 23:00
 */
public class HelloWorld extends Exception implements Cloneable, Serializable {

    private static final int intValue = 10;

    public void test() {
        int a = 1;
        int b = 2;
        int C = a + b;
    }
}
