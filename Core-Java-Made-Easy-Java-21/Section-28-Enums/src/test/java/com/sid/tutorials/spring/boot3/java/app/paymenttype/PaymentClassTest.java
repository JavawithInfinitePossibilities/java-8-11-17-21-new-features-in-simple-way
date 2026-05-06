package com.sid.tutorials.spring.boot3.java.app.paymenttype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 06-05-2026
 */
@DisplayName("Testing PaymentClass Enum")
class PaymentClassTest {


    @Test
    void values() {
        PaymentClass creditCard = PaymentClass.CREDIT_CARD;
        System.out.println("PaymentClass: " + creditCard);
    }

    @Test
    void valueOf() {
        System.out.println("PaymentClass: " + PaymentClass.valueOf("DEBIT_CARD"));
    }

    @Test
    void ordinal() {
        System.out.println("PaymentClass: " + Arrays.toString(PaymentClass.values()));
        System.out.println("Ordinal of CREDIT_CARD: " + PaymentClass.CREDIT_CARD.ordinal());
    }

    @Test
    void ordinalAndMethod() {
        System.out.println("PaymentClass: " + Arrays.toString(PaymentClass.values()));
        System.out.println("Ordinal of CREDIT_CARD: " + PaymentClass.CREDIT_CARD.ordinal());
        System.out.println("Fee of CASH_ON_DELIVERY: " + PaymentClass.UPI.getFee());
    }
}