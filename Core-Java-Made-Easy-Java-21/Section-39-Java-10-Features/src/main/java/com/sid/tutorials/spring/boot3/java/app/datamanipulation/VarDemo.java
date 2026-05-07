package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

/**
 * @author kunmu On 07-05-2026
 * Var is not allowed at class level, instance level, method return type, method parameter, lambda parameter, etc.
 * It is only allowed for local variables inside methods, constructors, or initializer blocks.
 * The compiler infers the type of the variable based on the initializer expression.
 * The variable must be initialized at the time of declaration, and the initializer expression cannot be null.
 * If the initializer expression is null, the compiler cannot infer the type of the variable,
 * and it will result in a compilation error.
 * The var keyword cannot be used with array initializers,
 * as the compiler cannot infer the type of the array elements.
 * For example, var arr = {1, 2, 3}; will result in a compilation error.
 * Instead, you can use var arr = new int[]{1, 2, 3}; to declare and initialize an array with var.
 * The var keyword cannot be used with lambda expressions, as the compiler cannot infer the type of the lambda parameters.
 * For example, var lambda = (x) -> x * 2; will result in a compilation error.
 * Instead, you can use var lambda = (int x) -> x * 2; to declare a lambda expression with var.
 * The var keyword cannot be used with method references,
 * as the compiler cannot infer the type of the method reference parameters. For example,
 * var methodRef = String::length; will result in a compilation error.
 * Instead, you can use var methodRef = (String s) -> s.length(); to declare a method reference with var.
 */
public class VarDemo {
    int i=10;
    String value="String";

     public void display(){
         var localVariable=100;
         var localString="Local String";
         System.out.println("Local Variable: "+localVariable);
         System.out.println("Local String: "+localString);
     }
}
