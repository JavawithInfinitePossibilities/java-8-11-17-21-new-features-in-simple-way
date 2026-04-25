package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import com.sid.tutorials.spring.boot3.java.app.data.module.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Employee> employees = DummyDataTable.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
