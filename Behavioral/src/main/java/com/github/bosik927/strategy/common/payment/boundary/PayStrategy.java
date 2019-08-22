package com.github.bosik927.strategy.common.payment.boundary;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}