<%--
  Created by IntelliJ IDEA.
  User: jagaa
  Date: 3/14/19
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <form action="login" method="post">
        Username: <input type="text" name="username" value="${cookie.username.value}"/><br/>
        Password: <input type="password" name="password"/><br/>
        <input type="checkbox" value="checked" name="remember" id="rememberme"/><label for="rememberme">Remember me</label><br/>
        <input type="submit" value="Log in"/>
    </form>
    <p style="color:red">${err_msg}</p>
</body>
</html>
