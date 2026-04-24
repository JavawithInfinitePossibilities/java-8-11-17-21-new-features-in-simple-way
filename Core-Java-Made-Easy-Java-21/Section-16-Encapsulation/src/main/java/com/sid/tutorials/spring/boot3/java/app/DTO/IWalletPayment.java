package com.sid.tutorials.spring.boot3.java.app.DTO;

/**
 * @author kunmu On 24-04-2026
 */
public interface IWalletPayment {
    void payment(String walletNumber, String paymentMode);
}
