package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.DTO.Employee;
import com.sid.tutorials.spring.boot3.java.app.DTO.PersonDetails;
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
    public void testEmployeeInheritance() {
        Employee employee = new Employee("John Doe", 30, "E123", "Engineering");

        PersonDetails personDetails = employee; // Upcasting to PersonDetails
        // Test inherited properties
        assertEquals("John Doe", employee.getName());
        assertEquals(30, employee.getAge());

        // Test own properties
        assertEquals("E123", employee.getEmployeeId());
        assertEquals("Engineering", employee.getDepartment());

        // Test static method
        employee.parentStaticMethod(); // Should print from Employee class
        PersonDetails.parentStaticMethod();// Should print from Person class

        // Test non-static method
        employee.parentNonstaticMethod(); // Should print from Employee class
        personDetails.parentNonstaticMethod();// Should print from person class


        assertEquals("NA", personDetails.pannumber);
        assertNotEquals("CGDPS1272F", personDetails.pannumber);
        assertEquals("CGDPS1272F", employee.pannumber);

        assertEquals("female", personDetails.gender);
        assertEquals("male", employee.gender);
    }
}
