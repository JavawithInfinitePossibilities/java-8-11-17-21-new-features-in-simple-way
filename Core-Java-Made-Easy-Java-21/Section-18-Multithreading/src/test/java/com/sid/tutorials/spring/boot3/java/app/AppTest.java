package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import com.sid.tutorials.spring.boot3.java.app.data.module.PrintClass;
import com.sid.tutorials.spring.boot3.java.app.data.module.ThreadCommunicationByObject;
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
    public void displayDataWithThread() {
        PrintClass printClass = new PrintClass(1, 1);
        Thread runThread1 = new Thread(new ThreadCommunicationByObject(printClass, 1, 30));
        Thread runThread2 = new Thread(new ThreadCommunicationByObject(printClass, 2, 30));
        Thread runThread3 = new Thread(new ThreadCommunicationByObject(printClass, 3, 30));
        runThread1.start();
        runThread2.start();
        runThread3.start();
    }

}
