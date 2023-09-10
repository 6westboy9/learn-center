package com.learn.basis.asm.sample;

import java.io.Serializable;
import java.util.Map;

/**
 * @author mumu
 * @since 2023/9/5 23:00
 */
public class HelloWorld extends Exception implements Cloneable, Serializable {

    private static final int intValue = 10;
    private String strValue;
    private HelloWorld helloWorld;
    private Map<String, Object> map;

    public void test() {
        int a = 1;
        int b = 2;
        int C = a + b;
    }

    public HelloWorld testObj(HelloWorld helloWorld,
                        String strValue,
                        Map<String, Object> map) {
        this.helloWorld = helloWorld;
        this.strValue = strValue;
        this.map = map;
        return this.helloWorld;
    }

    public void testThrowExp() throws Exception {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            throw e;
        }
    }
}
