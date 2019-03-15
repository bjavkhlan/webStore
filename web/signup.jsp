<%--
  Created by IntelliJ IDEA.
  User: jagaa
  Date: 3/15/19
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new account</title>
    <link href="<c:url value='/resources/css/login.css'/>" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <form action="signup" method="post">
        Username: <input required type="text" name="username" value="${cookie.username.value}"/><br/>
        Password: <input required type="password" name="password"/><br/>
        <input type="submit" value="Create an account"/>
    </form>
</div>
</body>
</html>

