package com.sid.tutorials.spring.boot3.java.app.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kunmu On 24-04-2026
 */
@Data
@NoArgsConstructor
public class Employee implements IPerson {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public Employee(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }


    @Override
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
