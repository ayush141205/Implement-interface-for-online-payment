<%
    String paymentMessage =
        (String) request.getAttribute("paymentMessage");

    String receipt =
        (String) request.getAttribute("receipt");
%>

<!DOCTYPE html>
<html>

<head>

    <title>Payment Success</title>

    <link rel="stylesheet" href="css/style.css">

</head>

<body>

<div class="container">

    <h2>Payment Successful</h2>

    <h3><%= paymentMessage %></h3>

    <p><%= receipt %></p>

</div>

</body>
</html>