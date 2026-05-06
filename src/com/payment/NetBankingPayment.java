package com.payment;

public class NetBankingPayment implements OnlinePayment {

    @Override
    public String processPayment(double amount) {

        return "Net Banking Payment of ₹" + amount + " Successful";
    }

    @Override
    public String generateReceipt(double amount) {

        return "Net Banking Receipt Generated for ₹" + amount;
    }
}