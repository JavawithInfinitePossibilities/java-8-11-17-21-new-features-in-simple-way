package com.sid.tutorials.spring.boot3.java.app.data;

/**
 * @author kunmu On 24-04-2026
 */
public class AccessModifierValues {
    private String name;
    protected String description;
    /*Package modifier*/
    int salary;
    public String department;

    public AccessModifierValues() {
        this.name = "John Doe";
        this.description = "A sample employee";
        this.salary = 50000;
        this.department = "Engineering";
    }

}
