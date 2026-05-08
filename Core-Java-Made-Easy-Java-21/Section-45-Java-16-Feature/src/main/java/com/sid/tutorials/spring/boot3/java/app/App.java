package com.sid.tutorials.spring.boot3.java.app;

/**
 * Hello world!
 *
 */
/*
 * Java 16 Feature
 * 1.    Records
 * 2.    Pattern Matching for instanceof
 * 3.    Sealed Classes
 * 4.    Local Variable Type Inference for Lambda Parameters
 * For example, var arr = {1, 2, 3}; will result in a compilation error.
 * Instead, you can use var arr = new int[]{1, 2, 3}; to declare and initialize an array with var.
 * The var keyword cannot be used with lambda expressions, as the compiler cannot infer the type of the lambda parameters.
 * For example, var lambda = (x) -> x * 2; will result in a compilation error.
 * Instead, you can use var lambda = (int x) -> x * 2; to declare a lambda expression with var.
 * The var keyword cannot be used with method references,
 * as the compiler cannot infer the type of the method reference parameters. For example,
 * var methodRef = String::length; will result in a compilation error.
 * Instead, you can use var methodRef = (String s) -> s.length(); to declare a method reference with var.
 * */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
