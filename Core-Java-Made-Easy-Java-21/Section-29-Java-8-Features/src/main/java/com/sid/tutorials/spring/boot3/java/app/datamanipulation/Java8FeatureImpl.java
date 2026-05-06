package com.sid.tutorials.spring.boot3.java.app.datamanipulation;
// @formatter:off
import java.util.function.Function;import java.util.function.Predicate;import java.util.function.Supplier; /**
 * @author kunmu On 06-05-2026
 * 1.   Lambda Expressions: Lambda expressions are a concise way to represent anonymous functions.
 *      They allow you to write code in a more functional style, making it easier to work with collections and streams.
 * 2.   Stream API: The Stream API provides a powerful way to process collections of data in a functional style.
 *      It allows you to perform operations like filtering, mapping, and reducing on collections in a more readable and efficient way.
 * 3.   Default Methods: Java 8 introduced default methods in interfaces,
 *      which allow you to provide a default implementation for a method in an interface.
 *      This feature helps in maintaining backward compatibility while adding new methods to interfaces.
 * 4.   Optional Class: The Optional class is a container object which may or may not contain a non-null value.
 * 5.   Date and Time API: Java 8 introduced a new Date and Time API (java.time package)
 *      that provides a more comprehensive and flexible way to handle date and time compared
 *      to the older java.util.Date and java.util.Calendar classes.
 * 6.   Functional Interfaces: Java 8 introduced the concept of functional interfaces,
 *      which are interfaces with a single abstract method. They can be used as the basis for lambda expressions and
 *      method references, making it easier to write functional programming code in Java.
 *7.    Method References: Method references provide a way to refer to methods without invoking them.
 *8.    Nashorn JavaScript Engine: Java 8 includes the Nashorn JavaScript engine,
 *      which allows you to execute JavaScript code from within Java applications.
 *9.    Parallel Streams: Java 8 allows you to process collections in parallel using the Stream API,
 *      which can improve performance for large datasets by utilizing multiple CPU cores.
 *10.   Type Annotations: Java 8 introduced type annotations, which allow you to apply annotations to types,
 *      providing more information about the code and enabling better static analysis and error checking.
 *11.   Repeating Annotations: Java 8 allows you to apply the same annotation multiple times to a single element,
 *      which can be useful for scenarios where you want to provide multiple pieces of information using annotations.
 *12.   Improved Type Inference: Java 8 improved type inference for generic types,
 *      making it easier to write code without having to specify types explicitly in certain situations,
 *      such as when using lambda expressions or the Stream API.
 *13.   CompletableFuture: Java 8 introduced the CompletableFuture class,
 *      which provides a powerful way to handle asynchronous programming and
 *      manage concurrent tasks in a more flexible and efficient manner.
 * 14.  predicate:  The Predicate interface is a functional interface that represents a boolean-valued function of
 *      one argument.It is commonly used in the Stream API for filtering collections based on certain conditions.
 * 15.  Consumer: The Consumer interface is a functional interface that represents an operation
 *      that takes a single input argument and returns no result.
 *      It is often used in the Stream API for performing actions on each element of a collection,
 *      such as printing or modifying the elements.
 * 16.  Supplier: The Supplier interface is a functional interface that represents a supplier of results.
 *      It is often used in the Stream API for providing values or generating data on demand,
 *      such as creating new instances or providing default values.
 * 17.  Function: The Function interface is a functional interface that represents a function
 *      that takes one argument and produces a result.
 *      It is commonly used in the Stream API for transforming data,
 *      such as mapping elements of a collection to a different type or applying a function to each element of a collection.
 * 18.  BiFunction: The BiFunction interface is a functional interface that represents a function
 *      that takes two arguments and produces a result.
 *      It is often used in the Stream API for operations that involve two inputs,
 *      such as combining elements of a collection or performing calculations based on two values.
 * 19.  UnaryOperator: The UnaryOperator interface is a functional interface
 *      that represents a function that takes a single argument and produces a result of the same type.
 *      It is commonly used in the Stream API for operations that involve modifying elements of a collection,
 *      such as incrementing values or applying a transformation to each element of a collection.
 * 20.  BinaryOperator: The BinaryOperator interface is a functional interface
 *      that represents a function that takes two arguments of the same type and produces a result of the same type.
 *      It is often used in the Stream API for operations that involve combining elements of a collection,
 *      such as summing values or concatenating strings.
 * 21.  BiConsumer: The BiConsumer interface is a functional interface
 *      that represents an operation that takes two input arguments and returns no result.
 *      It is commonly used in the Stream API for performing actions on pairs of elements in a collection,
 *      such as printing or modifying the elements based on certain conditions.
 *
 */
// @formatter:on
public class Java8FeatureImpl {

    private void lambdaExpressionExample() {
        Runnable runnable = () -> System.out.println("Hello from Lambda Expression!");
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public boolean predicate(String user,String pwd) {
        Predicate<String> isValidUser = s -> s.equals(pwd);
        return isValidUser.test(user);
    }

    public int getLengthOfString(String str) {
        Function<String, Integer> function = s -> s.length();
        return function.apply(str);
    }

    public void getConsumerExample(String str) {
        java.util.function.Consumer<String> consumer = s -> System.out.println("Consumed: " + s);
        consumer.accept(str);
    }

    public Integer getSupplierExample() {
        Supplier<Integer> supplier = () -> (int) (Math.random()*100);
        return supplier.get();
    }
}
