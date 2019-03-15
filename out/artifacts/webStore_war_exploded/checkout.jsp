<%--
  Created by IntelliJ IDEA.
  User: jagaa
  Date: 3/15/19
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Checkout</title>
</head>
<body>
    <h1>Thank you ${user.username}!</h1>
    <c:if test="${shoppingCart == null}">
        <h2 class="total">No item in your shopping cart!</h2>
    </c:if>
    <c:if test="${shoppingCart != null}">
        <h2 class="total">Total Price: $${shoppingCart.calculateTotalPrice()}</h2>
        <ol>
            <c:forEach items="${shoppingCart.items}" var="item">
                <li class="items">
                        ${item.name} : $${item.price}
                </li>
            </c:forEach>
        </ol>

    </c:if>
    <a href="/">Go Back</a>
</body>
</html>
