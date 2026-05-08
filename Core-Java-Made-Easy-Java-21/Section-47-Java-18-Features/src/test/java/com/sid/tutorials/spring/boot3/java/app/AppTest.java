package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import com.sid.tutorials.spring.boot3.java.app.datamanipulation.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App using JUnit 5.
 */
@DisplayName("App Tests")
public class AppTest {

    @BeforeEach
    void setup() {

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
    void testCompactNumberinstance() {
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String formattedNumber = numberFormat.format(1234567);
        System.out.println("Formatted number: " + formattedNumber);
    }

    @Test
    void testSealedClass() {
        BMWSeries bmwSeries = new BMWSeries("BMW Series 3", 2021);
        System.out.println(bmwSeries);
        BMWSeries3 bmwSeries3 = new BMWSeries3();
        System.out.println(bmwSeries3);

        BMWSeries bmwSeries5 = new BMWSeries5();
        System.out.println(bmwSeries5);
    }

    @Test
    void testJava16Features() {
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<Integer> list = stringList.stream().map(Integer::parseInt).toList();
        System.out.println(list);
        LocalTime localTime = LocalTime.parse("12:34:56");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
        String formattedTime = localTime.format(formatter);
        System.out.println(formattedTime);
    }

    @Test
    void testRandomGenerator() {
        int randomInt = RandomGenerator.getDefault().nextInt(1, 100);
        System.out.println("Random Integer: " + randomInt);
        System.out.println("Random Class: " + RandomGenerator.getDefault().getClass().getName());
        RandomGeneratorFactory.all().forEach(System.out::println);
    }

    @Test
    void testSwitchCase() {
        BMWSeries dayOfWeek = new BMWSeries5Upgrade();
        /*BMWSeries dayOfWeek = null;*/
        String dayName = switch (dayOfWeek) {
            case BMWSeries3 bmwSeries3 -> "Monday";
            case BMWSeries5Upgrade bmwSeries5Upgrade -> "Tuesday :"+bmwSeries5Upgrade.getYear();
            case BMWSeries5 bmwSeries5 -> "Thursday";
            case BMWSeries7 bmwSeries7 -> "Wednesday";
            case null-> {
                System.out.println("Null value");
                yield null;
            }
            default -> "Invalid day";
        };
        System.out.println("Day of week: " + dayName);
    }

}
