package com.payment;

public class CreditCardPayment implements OnlinePayment {

    @Override
    public String processPayment(double amount) {

        return "Credit Card Payment of ₹" + amount + " Successful";
    }

    @Override
    public String generateReceipt(double amount) {

        return "Credit Card Receipt Generated for ₹" + amount;
    }
}