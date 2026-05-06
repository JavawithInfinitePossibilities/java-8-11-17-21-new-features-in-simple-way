package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author kunmu On 07-05-2026
 */
@DisplayName("Regular Expression Class Tests")
class RegularExpressionClassTest {

    private RegularExpressionClass regularExpressionClass;

    @BeforeEach
    void setup() {
        regularExpressionClass = new RegularExpressionClass();
    }

    @Test
    public void getFirstPatternMatch() {
        regularExpressionClass.getFirstPatternMatch("abc", "abcefghabcijklabcmnopqrstabcuvwxyz");
    }

    @Test
    public void getEmailPatternMatch() {
        if (regularExpressionClass.getEmailPatternMatch("^[a-zA-Z0-9._%+-]+@[A-Z0-9.-]+\\.[a-zA-Z]{2,6}$", "user@example.com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

}