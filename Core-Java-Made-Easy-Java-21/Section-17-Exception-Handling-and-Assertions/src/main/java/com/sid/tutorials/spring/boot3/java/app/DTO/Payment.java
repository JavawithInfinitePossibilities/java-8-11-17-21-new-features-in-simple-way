package com.sid.tutorials.spring.boot3.java.app.DTO;

import com.sid.tutorials.spring.boot3.java.app.DTO.dtointerface.ICreditcardPayment;
import com.sid.tutorials.spring.boot3.java.app.DTO.dtointerface.IWalletPayment;

/**
 * @author kunmu On 24-04-2026
 */
public class Payment implements ICreditcardPayment, IWalletPayment {
    @Override
    public void payment(String creditcardNumber, String paymentMode, String CVV) {
        System.out.println("Payment made using Credit Card: " + creditcardNumber
                + ", Payment Mode: " + paymentMode
                + ", CVV: " + CVV);
    }

    @Override
    public void payment(String walletNumber, String paymentMode) {
        System.out.println("Payment made using Wallet: " + walletNumber
                + ", Payment Mode: " + paymentMode);
    }
}
