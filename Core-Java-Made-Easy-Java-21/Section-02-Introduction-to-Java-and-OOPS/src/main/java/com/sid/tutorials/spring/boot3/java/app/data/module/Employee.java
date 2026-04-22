package com.sid.tutorials.spring.boot3.java.app.data.module;

import lombok.Builder;
import lombok.Data;

/**
 * @author kunmu On 22-04-2026
 */
@Data
public class Employee {
    private String name;
    private String designation;
    private double salary;
    private String city;

    /**
     * @param name
     * @param designation
     * @param salary
     * @param city
     */
    @Builder
    public Employee(String name, String designation, double salary, String city) {
        super();
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }
}
