package com.sid.tutorials.spring.boot3.java.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread State: " + Thread.currentThread().getState());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println("Thread Group: " + Thread.currentThread().getThreadGroup());
        long startTime = System.currentTimeMillis();
        System.out.println("Start time : " + startTime);
        App app = new App();
        app.printNumbers();
        app.printNumbers();
        app.printNumbers();
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + " ms");
        Runnable runnable = () -> {
            app.printNumbers();
        };
        Runnable runnable1 = () -> {
            app.printNumbers();
        };
        Runnable runnable2 = () -> {
            app.printNumbers();
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable2);
        startTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + " ms");
    }

    void printNumbers() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
