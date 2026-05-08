package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import com.sid.tutorials.spring.boot3.java.app.dataManipulation.Java13And14Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App using JUnit 5.
 */
@DisplayName("App Tests")
public class AppTest {

    Java13And14Feature java13And14Feature;

    @BeforeEach
    void setup() {
        java13And14Feature = new Java13And14Feature();
    }

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

    @Test
    public void testIsBlank() {
        String str = "  ";
        assertTrue(str.isBlank());
    }

    @Test
    void testSwitchCase() {
        int dayOfWeek = 8;
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            case 8 -> {
                yield "Invalid day";
            }
            default -> "Invalid day";
        };
        System.out.println("Day of week: " + dayName);
    }

    @Test
    void testCompactNumberinstance() {
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String formattedNumber = numberFormat.format(1234567);
        System.out.println("Formatted number: " + formattedNumber);
    }

    @Test
    void testPatternMatching() {
        Object obj = java13And14Feature.getValue();
        if(obj instanceof String str){
            System.out.println("String value: " + str);
        }
    }

    @Test
    void testPersonDetails(){
        Java13And14Feature.Person person = java13And14Feature.getPerson();
        System.out.println("Person Name: " + person.name() + ", Age: " + person.age()+" myvalue: "+ Java13And14Feature.Person.myValue);
    }
}
