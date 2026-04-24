package com.sid.tutorials.spring.boot3.java.app.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author kunmu On 24-04-2026
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Employee extends PersonDetails {
    private String employeeId;
    private String department;
    /*To access the child class member which has same identifier as parent calss
    but not static then use the variable to access instance variable
    Employee e=new Employee();
    e.pannumber; // will access the child class variable
    */
    public String pannumber = "CGDPS1272F";
    /*This is call data hiding.*/
    public static String gender = "male";

    /* for Method when it is declared with same name and static it is called method hiding*/
    public static void parentStaticMethod() {
        System.out.println("This is a static method in Employee class");
    }

    @Override
    public void parentNonstaticMethod() {
        System.out.println("This is a non static method in Employee class");
    }

    public Employee(String name, int age, String employeeId, String department) {
        super.setName(name);
        super.setAge(age);
        this.employeeId = employeeId;
        this.department = department;
    }
}
