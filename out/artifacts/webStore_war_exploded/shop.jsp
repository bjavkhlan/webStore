<%--
  Created by IntelliJ IDEA.
  User: jagaa
  Date: 3/14/19
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Store</title>
    <%--<link href="css/style.css" type="text/css" rel="stylesheet" />--%>
    <%--<script src="js/script.js"></script>--%>
</head>
<body>
<div class="header">
    <a href="login">login</a>
    ${user.username}
    <a href="logout">logout</a>
</div>
<div class="container">
    <%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
    <%--<c:out value="${products.size()}"></c:out>--%>
        ${products.size()}
    ${products.get(0).getName()}
        <form action="/" method="post">
            <input type="text" name="productId" />
            <input type="submit" value="add to cart" />
        </form>


        <div class="shoppingCart">
            <a href="shoppingCart"><strong>Shopping Cart</strong> [${shoppingCart.size}]<br/>
            <a href="checkout">checkout</a><br/>
                ${shoppingCart.calculateTotalPrice()}
        </div>



</div>
</body>
</html>
