package com.sid.tutorials.spring.boot3.java.app.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kunmu On 24-04-2026
 */
/*Does @Data of lombok has noargsconstructor in it?
 * No, @Data of Lombok does NOT include a no-argument constructor by default.
 * The @Data annotation generates getters, setters, toString, equals,
 *   and hashCode methods for the class,
 * but it does not generate a no-argument constructor.
 * Getters for all fields
 * Setters for all fields
 * Constructor with arguments (for all fields)
 * toString() method
 * equals() and hashCode() methods
 * NO no-argument constructor
 * */
@Data
@NoArgsConstructor
public class PersonDetails {
    private String name;
    private int age;
    /*How to access a static property
    * Use the class name to access even the parent class is initialized by child class.
    * PersonDetails p=new Employee();
    * PersonDetails.pannumber;
    * */
    public static String pannumber="NA";
    public static String gender="female";

    public static void parentStaticMethod() {
        System.out.println("This is a static method in PersonDetails");
    }

    public void parentNonstaticMethod() {
        System.out.println("This is a non static method in PersonDetails");
    }
}
