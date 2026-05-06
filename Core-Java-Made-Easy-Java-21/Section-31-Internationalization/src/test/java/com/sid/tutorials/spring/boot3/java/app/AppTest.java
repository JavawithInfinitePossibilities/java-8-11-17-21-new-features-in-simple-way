package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
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

    @Test
    public void testLocalClass() {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getLanguage());
        double d = 123456.4321;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Indian format : " + numberFormat.format(d));
        numberFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println("USA formate : " + numberFormat.format(d));

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        System.out.println("India date formate : "+dateFormat.format(System.currentTimeMillis()));
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        System.out.println("US date format : "+dateFormat.format(System.currentTimeMillis()));

        DateFormat timeInstance = DateFormat.getTimeInstance(0, locale);
        System.out.println("Indian time format : "+timeInstance.format(System.currentTimeMillis()));

        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        System.out.println("Indian date time format : "+dateTimeInstance.format(System.currentTimeMillis()));
    }

}
