package com.payment;

public interface OnlinePayment {

    String processPayment(double amount);

    String generateReceipt(double amount);
}