package com.payment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String paymentMethod =
                request.getParameter("paymentMethod");

        double amount =
                Double.parseDouble(request.getParameter("amount"));

        OnlinePayment payment = null;

        if(paymentMethod.equals("UPI")) {

            payment = new UPIPayment();

        } else if(paymentMethod.equals("CARD")) {

            payment = new CreditCardPayment();

        } else if(paymentMethod.equals("NETBANKING")) {

            payment = new NetBankingPayment();
        }

        String paymentMessage =
                payment.processPayment(amount);

        String receipt =
                payment.generateReceipt(amount);

        request.setAttribute("paymentMessage", paymentMessage);

        request.setAttribute("receipt", receipt);

        request.getRequestDispatcher("success.jsp")
               .forward(request, response);
    }
}