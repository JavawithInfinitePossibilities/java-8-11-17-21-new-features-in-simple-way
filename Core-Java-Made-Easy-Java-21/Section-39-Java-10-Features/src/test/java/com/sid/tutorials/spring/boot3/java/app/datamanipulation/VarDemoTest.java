package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 07-05-2026
 */
@DisplayName("VarDemo Test Cases")
class VarDemoTest {
    VarDemo obj;

    @BeforeEach
    void setUp() {
        obj = new VarDemo();
    }

    @Test
    void display() {
        obj.display();
    }
}