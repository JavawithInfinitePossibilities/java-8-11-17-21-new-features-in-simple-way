package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 06-05-2026
 */
@DisplayName("DataCalculation Tests")
class ConcurrentCollectionClassTest {
    public ConcurrentCollectionClass concurrentCollectionClass;

    @BeforeEach
    void setUp() {
        concurrentCollectionClass = new ConcurrentCollectionClass();
    }

    @Test
    void checkCopyOnwriteArrayList() {
        concurrentCollectionClass.checkCopyOnwriteArrayList();
    }

    @Test
    void checkCopyOnwriteArraySet() {
        concurrentCollectionClass.checkCopyOnwriteArraySet();
    }

    @Test
    void checkCopyOnwriteHashMap() {
        concurrentCollectionClass.checkConcurrentHashmap();
    }
}