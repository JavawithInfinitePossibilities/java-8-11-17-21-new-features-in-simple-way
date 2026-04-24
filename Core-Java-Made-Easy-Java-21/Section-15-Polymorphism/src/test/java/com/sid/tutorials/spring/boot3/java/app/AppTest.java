package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.DTO.*;
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

    @Test
    @DisplayName("Test Polymorphism with payment.Compile time Polymorphism (Method Overloading)")
    public void testStaticPolymorphismVehicle() {
        Payment payment = new Payment();
        payment.payment("1234-5678-9012-3456", "Credit Card", "123");
        payment.payment("9876543210", "Mobile Wallet");
    }

    @Test
    @DisplayName("Test Polymorphism with IVehicle.Runtime Polymorphism (Method Overriding)")
    public void testPolymorphismVehicle() {
        IVehicle honda = new Honda("Car","Honda","Manuall",6);
        honda.brand();
        honda.vaichelType();
        honda.gearBox();
        honda.transmissionType();
        IVehicle hyundai = new Hyundai("Car","Hyundai","Manuall",6);
        hyundai.brand();
        hyundai.vaichelType();
        hyundai.gearBox();
        hyundai.transmissionType();
        IVehicle bmw = new BMWVehicle("Car","BMW","Automatic",8);
        bmw.brand();
        bmw.vaichelType();
        bmw.gearBox();
        bmw.transmissionType();
        IVehicle hondaByke = new Honda("Bike","Honda","Automatic",null);
        hondaByke.brand();
        hondaByke.vaichelType();
        hondaByke.gearBox();
        hondaByke.transmissionType();
    }

}
