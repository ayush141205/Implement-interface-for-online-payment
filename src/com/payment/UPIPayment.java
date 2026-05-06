package com.payment;

public class UPIPayment implements OnlinePayment {

    private String formatAmount(double amount) {
        return String.format("%.2f", amount);
    }

    @Override
    public String processPayment(double amount) {

        return "UPI Payment of ₹" + formatAmount(amount) + " Successful";
    }

    @Override
    public String generateReceipt(double amount) {

        return "UPI Receipt Generated for ₹" + formatAmount(amount);
    }
}