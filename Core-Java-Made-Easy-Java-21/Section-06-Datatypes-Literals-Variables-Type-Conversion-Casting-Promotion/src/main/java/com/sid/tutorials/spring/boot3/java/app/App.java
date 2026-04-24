package com.sid.tutorials.spring.boot3.java.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Primitive Data types in Java:");
        byte b = 127;
        System.out.println("byte value: " + b);
        short s = 32767;
        System.out.println("short value: " + s);
        int i = 2147483647;
        System.out.println("int value: " + i);
        long l = 2147483647L;
        System.out.println("long value: " + l);
        float f = 2147483647F;
        System.out.println("float value: " + f);
        double d = 2147483647D;
        System.out.println("double value: " + d);
        char c = 'a';
        System.out.println("char value: " + c);
        boolean bool = true;
        System.out.println("boolean value: " + bool);

        System.out.println("Wrapper classes in Java:");
        String str = "Hello World!";
        System.out.println("String value: " + str);
        int[] arrayValue = new int[10];
        arrayValue[0] = 1;
        arrayValue[1] = 2;
        System.out.println("Array value: " + arrayValue[0] + ", " + arrayValue[1]);
        A a = new A();
        System.out.println("A class value: " + a.a);
        System.out.println("A class address: " + a);

        System.out.println("Type implicit conversion and casting in Java:");
        i = c;
        System.out.println("i class value: " + i);
        System.out.println("Type explicit conversion and casting in Java:");
        b = (byte) 140;
        System.out.println("b class value: " + b);
        c = (char) b;
        System.out.println("c class value: " + c);

    }

}

class A {
    int a = 10;
}
