package com.sid.tutorials.spring.boot3.java.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x = 100, y = 200;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("x+y=" + (x + y));
        System.out.println("x-y=" + (x - y));
        System.out.println("x*y=" + (x * y));
        System.out.println("y/x=" + (y / x));
        System.out.println("x%y=" + (x % y));
        System.out.println("x++=" + (x++));
        System.out.println("x value after increment=" + x);
        System.out.println("x--=" + (x--));
        System.out.println("x value after decrement=" + x);
        System.out.println("++x=" + (++x));
        System.out.println("x value after pre-increment=" + x);
        System.out.println("--x=" + (--x));
        System.out.println("x value after pre-decrement=" + x);
        System.out.println("x<y:" + (x < y));
        System.out.println("x<=y:" + (x <= y));
        System.out.println("x>y:" + (x > y));
        System.out.println("x==y:" + (x == y));
        System.out.println("x!=y:" + (x != y));
        x = 4;
        y = 5;
        System.out.println("Binary value of x : " + Integer.toBinaryString(x));
        System.out.println("Binary value of y : " + Integer.toBinaryString(y));
        System.out.println("x&y=" + (x & y));
        System.out.println("x|y=" + (x | y));
        System.out.println("x^y=" + (x ^ y));
    }
}
