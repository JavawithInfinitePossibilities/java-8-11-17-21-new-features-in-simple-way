package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

/**
 * @author kunmu On 06-05-2026
 */
@FunctionalInterface
public interface ExtendsFnclIntf extends FunctionInterfaceForExmpl {

    /*public int setMyAge();*/

    default String display() {
        System.out.println("This is a default method in the extended functional interface.");
        return "This is a default method in the extended functional interface.";
    }
}
