package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

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
}
