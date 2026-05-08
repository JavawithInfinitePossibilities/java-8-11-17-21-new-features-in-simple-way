package com.sid.tutorials.spring.boot3.java.app.dataManipulation;

/**
 * @author kunmu On 08-05-2026
 */
public class Java13And14Feature {
    public Object getValue() {
        return "Hello, World!";
    }

    public record Person(String name, int age) {
        public static int myValue=0;
        public Person() {
            this("Hello", 30);
        }
    }

    public Person getPerson() {
        return new Person("John", 25);
    }
}
