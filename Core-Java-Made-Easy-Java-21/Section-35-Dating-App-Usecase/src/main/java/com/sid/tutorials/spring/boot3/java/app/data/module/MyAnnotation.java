package com.sid.tutorials.spring.boot3.java.app.data.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kunmu On 06-05-2026
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
     String name() default "Default Name";
     int value() default 0;
}
