package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 26-04-2026
 */
@DisplayName("DataCalculation Tests")
class DataCalculationTest {
    private DataCalculation dataCalculation;

    @BeforeEach
    void setUp() {
        dataCalculation = new DataCalculation();
    }

    @Test
    void getListOfData() {
        dataCalculation.getListOfData();
    }

    @Test
    void getSetOfData() {
        dataCalculation.getSetOfData();
    }

    @Test
    void getMapOfData() {
        dataCalculation.getMapOfData();
    }

    @Test
    void getMapAsceOfData() {
        Map<String, String> sortedMapOfDataMethodAsce = dataCalculation.getSortedMapOfDataMethodAsce();
        sortedMapOfDataMethodAsce.forEach((key,value)->{
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }

    @Test
    void getMapDescOfData() {
        Map<String, String> sortedMapOfDataMethodAsce = dataCalculation
                .getSortedMapOfDataMethodDesc();
        sortedMapOfDataMethodAsce.forEach((key,value)->{
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}