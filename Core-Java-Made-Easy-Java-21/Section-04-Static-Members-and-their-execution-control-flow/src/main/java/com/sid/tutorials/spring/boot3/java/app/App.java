package com.sid.tutorials.spring.boot3.java.app;

/**
 * Hello world!
 *
 */
public class App {

    static {
        System.out.println("Static block executed");
        /*printStaticMethod();*/
    }

    {
        System.out.println("Instance block executed");
        /*printStaticMethod();
        printInstancMethod();*/
    }

    public static void printStaticMethod() {
        System.out.println("Static method executed");
    }

    public void printInstancMethod() {
        System.out.println("Method executed");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        App.printStaticMethod();
        App app = new App();
    }
}
