package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 08-05-2026
 */
@DisplayName("Java 21 Virtual Thread Test")
class Java21VirtualThreadTest {
    Java21VirtualThread java21VirtualThread;

    @BeforeEach
    void setUp() {
        java21VirtualThread = new Java21VirtualThread();
    }

    @Test
    void virtualThreadExample() {
        try {
            java21VirtualThread.virtualThreadExample();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}