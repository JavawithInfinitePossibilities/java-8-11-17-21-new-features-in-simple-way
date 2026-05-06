package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import com.sid.tutorials.spring.boot3.java.app.data.module.MyAnnotation;

/**
 * @author kunmu On 06-05-2026
 */
public class UseMyAnnotation {
    @MyAnnotation(name = "Test Method", value = 42)
    public void annotatedMethod() {
        System.out.println("This method is annotated with MyAnnotation.");
    }
}
