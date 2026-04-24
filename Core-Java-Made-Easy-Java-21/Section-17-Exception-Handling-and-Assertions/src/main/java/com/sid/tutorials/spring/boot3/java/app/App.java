package com.sid.tutorials.spring.boot3.java.app;

/**
 * Hello world!
 *
 */
/*Throwable is the parent class.
 *   1.     Error: A situation where we can't recover.
 *   2.     Exception: A situation where we can decide how can we recover.
 *          1.  Runtime Exception: This exception are unchecked exception.
 *                              We don't need to handle this exception. This exception are not checked at compile time.
 *          2.  Compile time Exception: This exception are checked exception.
 *                                   We need to handle this exception. This exception are checked at compile time.
 *   3.    We can handle the exception using try catch block. We can also use throws keyword to declare the exception.
 *   4.    We can also create our own custom exception by extending the Exception class or Runtime.
 *   5.    We can also use finally block to execute the code that we want to execute regardless of whether
 *          an exception is thrown or not.
 * */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Throwable e = new Throwable("This is a test");
        e.printStackTrace();
        RuntimeException rte = new RuntimeException("This is a test. This is a runtime exception");
        rte.printStackTrace();
        Exception ce = new Exception("This is a test. This is a compile time exception");
        ce.printStackTrace();
    }
}
