package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

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
    public void testStaticInnerClass() {
        Map<String, String> stringStringMap = DummyDataTable.stringMapData();
        for (Map.Entry<String, String> stringStringEntry : stringStringMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + ": " + stringStringEntry.getValue());
        }
    }
}
