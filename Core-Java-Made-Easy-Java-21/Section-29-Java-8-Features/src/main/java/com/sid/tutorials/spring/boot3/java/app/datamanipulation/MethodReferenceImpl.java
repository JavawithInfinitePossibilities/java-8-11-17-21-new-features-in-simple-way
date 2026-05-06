package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import java.text.DateFormat;
import java.util.Date;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author kunmu On 06-05-2026
 *
 * Method References in Java 8:
 * A method reference is used to refer to a method of a functional interface.
 * It is a shorter and more readable alternative to lambda expression.
 *
 * Four Types of Method References:
 * 1. Static Method Reference: ClassName::staticMethodName
 * 2. Instance Method Reference: object::instanceMethodName
 * 3. Instance Method Reference of a Class: ClassName::instanceMethodName
 * 4. Constructor Reference: ClassName::new
 */
public class MethodReferenceImpl {
    public String getName(String name){
        return "Welcome : "+name;
    }

    public static int getYear(long year){
        return new Date(year).getYear();
    }

    /**
     * Example 1: Static Method Reference
     * Syntax: ClassName::staticMethodName
     */
    public void staticMethodReferenceExample() {
        System.out.println("========== STATIC METHOD REFERENCE ==========\n");

        // Using Lambda
        Function<Long, Integer> lambdaFunc = year -> getYear(year);
        System.out.println("Using Lambda: " + lambdaFunc.apply(System.currentTimeMillis()));

        // Using Method Reference
        Function<Long, Integer> methodRefFunc = MethodReferenceImpl::getYear;
        System.out.println("Using Method Reference: " + methodRefFunc.apply(System.currentTimeMillis()));
    }

    /**
     * Example 2: Instance Method Reference
     * Syntax: object::instanceMethodName
     */
    public void instanceMethodReferenceExample() {
        System.out.println("\n========== INSTANCE METHOD REFERENCE ==========\n");

        MethodReferenceImpl impl = new MethodReferenceImpl();

        // Using Lambda
        Function<String, String> lambdaFunc = name -> impl.getName(name);
        System.out.println("Using Lambda: " + lambdaFunc.apply("John"));

        // Using Method Reference
        Function<String, String> methodRefFunc = impl::getName;
        System.out.println("Using Method Reference: " + methodRefFunc.apply("Alice"));
    }

    /**
     * Example 3: Class Method Reference (Arbitrary Instance)
     * Syntax: ClassName::instanceMethodName
     */
    public void classMethodReferenceExample() {
        System.out.println("\n========== CLASS METHOD REFERENCE ==========\n");

        List<String> strings = Arrays.asList("Hello", "World", "Java", "8");

        System.out.println("Using Lambda:");
        strings.forEach(s -> System.out.println(s.toUpperCase()));

        System.out.println("\nUsing Method Reference:");
        strings.forEach(String::toUpperCase);

        System.out.println("\nLength of each string using Method Reference:");
        strings.forEach(s -> System.out.println(s + " -> " + s.length()));
    }

    /**
     * Example 4: Constructor Reference
     * Syntax: ClassName::new
     */
    public void constructorReferenceExample() {
        System.out.println("\n========== CONSTRUCTOR REFERENCE ==========\n");

        // Using Lambda - creating Date objects
        Function<Long, Date> lambdaFunc = time -> new Date(time);
        Date date1 = lambdaFunc.apply(System.currentTimeMillis());
        System.out.println("Using Lambda: " + date1);

        // Using Constructor Reference
        Function<Long, Date> constructorRef = Date::new;
        Date date2 = constructorRef.apply(System.currentTimeMillis());
        System.out.println("Using Constructor Reference: " + date2);
    }

    /**
     * Example 5: Practical Use Case with Streams
     */
    public void streamMethodReferenceExample() {
        System.out.println("\n========== METHOD REFERENCE WITH STREAMS ==========\n");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        System.out.println("Using Lambda:");
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

        System.out.println("\nUsing Method Reference (More Readable):");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("\nCombining with filter and method reference:");
        names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    /**
     * Demonstrate all method reference types
     */
    public void demonstrateAllMethodReferences() {
        staticMethodReferenceExample();
        instanceMethodReferenceExample();
        classMethodReferenceExample();
        constructorReferenceExample();
        streamMethodReferenceExample();
    }
}
