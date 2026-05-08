package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 08-05-2026
 */
@DisplayName("Java 21 Sequenced Collection Test")
class Java21SequencedCollectionTest {
    Java21SequencedCollection java21SequencedCollection;

    @BeforeEach
    void setUp() {
        java21SequencedCollection = new Java21SequencedCollection();
    }

    @Test
    void sequencedCollectionExample() {
        assertThrows(UnsupportedOperationException.class, () -> java21SequencedCollection.sequencedCollectionExample());
    }
}