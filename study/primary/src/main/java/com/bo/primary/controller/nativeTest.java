package com.bo.primary.controller;

import java.io.File;

/**
 * @Author: supermanYB
 * @Date: 2019/9/18 14:08
 * @Version 1.0
 */
public class nativeTest {
    public native void displayHelloWorld();
    static{
//        System.load("D:\\C\\HelloWorld.dll");
        System.load("D:\\C\\libhello.so");
//        System.loadLibrary("hello");
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
//        System.out.println(System.getProperty("java.library.path"));
        new nativeTest().displayHelloWorld();
    }
}
