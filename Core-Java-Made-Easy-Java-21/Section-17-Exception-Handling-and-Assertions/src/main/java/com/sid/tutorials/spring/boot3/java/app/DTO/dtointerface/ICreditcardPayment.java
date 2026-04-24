package com.sid.tutorials.spring.boot3.java.app.DTO.dtointerface;

/**
 * @author kunmu On 24-04-2026
 */
public interface ICreditcardPayment {
    void payment(String creditcardNumber,String paymentMode,String CVV);
}
