package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import com.sid.tutorials.spring.boot3.java.app.data.module.CustomExecutorServices;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App using JUnit 5.
 */
@DisplayName("App Tests")
public class AppTest {

    @Test
    @DisplayName("Should pass a simple test")
    public void testAppHasAGreeting() {
        assertTrue(true);
    }

    @Test
    public void displayData() {
        DummyDataTable.getEmployees().forEach(System.out::println);
    }

    @Test
    public void customExecutorWithThread() {
        CustomExecutorServices executorService = new CustomExecutorServices(3);
        executorService.setShutdown(false);
        executorService.start();
        Runnable r1 = () -> {
            try {
                System.out.println("Task 1 is running...");
                Thread.currentThread().sleep(6000);
                System.out.println("Task 1 is completed...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r2 = () -> {
            try {
                System.out.println("Task 2 is running...");
                Thread.currentThread().sleep(5000);
                System.out.println("Task 2 is completed...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r3 = () -> {
            try {
                System.out.println("Task 3 is running...");
                Thread.currentThread().sleep(4000);
                System.out.println("Task 3 is completed...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r4 = () -> {
            try {
                System.out.println("Task 4 is running...");
                Thread.currentThread().sleep(3000);
                System.out.println("Task 4 is completed...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r5 = () -> {
            try {
                System.out.println("Task 5 is running...");
                Thread.currentThread().sleep(2000);
                System.out.println("Task 5 is completed...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r6 = () -> {
            try {
                System.out.println("Task 6 is running...");
                Thread.currentThread().sleep(1000);
                System.out.println("Task 6 is completed...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        try {
            executorService.addTask(r1);
            executorService.addTask(r2);
            executorService.addTask(r3);
            executorService.addTask(r4);
            executorService.addTask(r5);
            executorService.addTask(r6);
            executorService.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.setShutdown(true);
    }
}
