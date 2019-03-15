<%--
  Created by IntelliJ IDEA.
  User: jagaa
  Date: 3/14/19
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Web Store</title>
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet"/>
    <script src="<c:url value='/resources/js/script.js'/>"></script>
</head>
<body>

<header>
    <div class="user">
        <c:if test="${user == null}" ><a href="login">Login</a></c:if>
        <c:if test="${user != null}" ><strong>${user.username}</strong></br> <a href="logout">(logout)</a></c:if>
    </div>
    <div class="shoppingCart">
        <a href="shoppingCart"><strong>Shopping Cart</strong> [${shoppingCart.size}]<br/>
            <a href="checkout">checkout</a>
            ${shoppingCart.calculateTotalPrice()}
    </div>
</header>

<div class="container">

    <c:forEach items="${products}" var="item">
        <div class="product">
            <div class="itemImage"><img  src="<c:url value='${item.picturePath}'/>" alt="${item.name}"/></div>
            <div class="itemName">${item.name}</div>
            <div class="itemPrice">${item.price}</div>
            <form action="/" method="post">
                <input type="text" style="visibility: hidden" name="productId" value="${item.id}" /><br/>
                <input type="submit" value="add to cart" />
            </form>
        </div>
    </c:forEach>




    <footer>

    </footer>

</div>
</body>
</html>
