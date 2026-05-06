# Online Payment Interface Demo

A simple Java Servlet/JSP web app that demonstrates an `OnlinePayment` interface with multiple implementations (UPI, credit card, net banking). Users submit a payment amount and method from a form and get a success page with a message and receipt.

## Features

- Common `OnlinePayment` interface with multiple implementations
- JSP front-end with a single payment form
- Servlet controller that routes to the right payment implementation
- Basic success page showing payment status and receipt

## Project Structure

- src/com/payment/: Java source (interface, implementations, servlet)
- WebContents/: JSP pages and static assets
- WebContents/WEB-INF/web.xml: basic web app config
- pom.xml: Maven configuration (Servlet API dependency)

## Tech Stack

- Java Servlets (Servlet API 4.0.1)
- JSP
- Maven

## How It Works

1. `index.jsp` renders a form to collect amount and payment method.
2. The form posts to `PaymentServlet`.
3. `PaymentServlet` selects the correct `OnlinePayment` implementation.
4. The servlet generates a message and receipt and forwards to `success.jsp`.

## Run Locally

1. Build the project:

   ```bash
   mvn clean package
   ```

2. Deploy the generated WAR to a Servlet container (Tomcat 9+ recommended).
3. Open the app in your browser (for example, `http://localhost:8080/otp/`).

## Notes

- The Servlet API dependency is marked as `provided`, so the container must supply it.
- The UI is a minimal demo meant for learning and experimentation.
