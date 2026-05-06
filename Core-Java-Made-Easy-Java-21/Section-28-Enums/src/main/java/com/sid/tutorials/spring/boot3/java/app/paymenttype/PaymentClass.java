package com.sid.tutorials.spring.boot3.java.app.paymenttype;

/**
 * @author kunmu On 06-05-2026
 */
public enum PaymentClass {

    CREDIT_CARD(5), DEBIT_CARD(1), NET_BANKING(1), UPI(1), CASH_ON_DELIVERY(0);
    private int fee;
    private PaymentClass(int fee) {
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }
}
