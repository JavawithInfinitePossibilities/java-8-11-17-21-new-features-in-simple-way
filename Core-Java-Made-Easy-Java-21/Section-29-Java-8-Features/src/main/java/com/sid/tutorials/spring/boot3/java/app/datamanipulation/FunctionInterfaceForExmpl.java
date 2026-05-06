package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

/**
 * @author kunmu On 06-05-2026
 */
@FunctionalInterface
public interface FunctionInterfaceForExmpl {

    public String setMyname(String name);

    default String display() {
        return "This is a default method in the functional interface.";
    }
}
