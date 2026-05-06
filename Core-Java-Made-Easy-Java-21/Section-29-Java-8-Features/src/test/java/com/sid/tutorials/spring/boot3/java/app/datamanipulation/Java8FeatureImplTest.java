package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 06-05-2026
 */
class Java8FeatureImplTest {
    private Java8FeatureImpl java8FeatureImpl;

    @BeforeEach
    void setUp() {
        java8FeatureImpl = new Java8FeatureImpl();
    }

    @Test
    void predicate() {
        if (java8FeatureImpl.predicate("Sid", "Sid")) {
            System.out.println("Predicate test passed");
        } else {
            fail("Predicate test failed");
        }
    }

    @Test
    void getLengthOfString() {
        System.out.println(java8FeatureImpl.getLengthOfString("Hello, World!"));
    }

    @Test
    void getConsumerExample() {
        java8FeatureImpl.getConsumerExample("Hello, World!");
    }

    @Test
    void getSupplierExample() {
        System.out.println(java8FeatureImpl.getSupplierExample());
    }

    @Test
    void getMethodReferenceExample() {
        MethodReferenceImpl methodReferenceImpl = new MethodReferenceImpl();
        MethodReferenceExmpl exmpl=methodReferenceImpl::getName;
        System.out.println(exmpl.getString("Sid"));
        MethodReferenceByStaticCall byStaticCall=MethodReferenceImpl::getYear;
        System.out.println(byStaticCall.getYear(System.currentTimeMillis()));
    }
}