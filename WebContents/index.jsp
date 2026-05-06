<!DOCTYPE html>
<html>

<head>

    <title>Online Payment System</title>

    <link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="container">

    <h2>Online Payment System</h2>

    <form action="PaymentServlet" method="post">

        <input type="number"
               step="0.01"
               name="amount"
               placeholder="Enter Amount"
               required>

        <select name="paymentMethod">

            <option value="UPI">UPI Payment</option>

            <option value="CARD">Credit Card</option>

            <option value="NETBANKING">Net Banking</option>

        </select>

        <button type="submit">
            Pay Now
        </button>

    </form>

</div>

</body>
</html>