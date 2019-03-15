<%--
  Created by IntelliJ IDEA.
  User: julia
  Date: 2019-03-14
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Login</title>
    <link href="resources/css/index.css" rel="stylesheet" />
</head>

<body>
<div class="header">WORLDWIDE SHIPPING, FREE SHIPPING OVER $50</div>
<div class="topnav">
    <a href="#" id="logo"><img src="resources/images/logo_new.svg"/></a>
    <a href="#">Checkout</a>
    <a href="#">Cart</a>
</div>
<div class="row">
    <div class="login">
        <h3>RETURNING GUESTS:</h3>
        <form acion="login" method="post">
            Username: <input name="username" /><br />
            Password: <input name="password" type="password" /><br />
            <input type="button" name="loginButton" value="Login" />
        </form>
    </div>
    <div class="register">
        <h3>DON'T HAVE AN ACCOUNT?</h3>
        <form acion="register" method="post">
            Username: <input name="username" /><br />
            Password: <input name="password" type="password" /><br />
            <input type="button" name="registerButton" value="Create Account" />
        </form>
    </div>
</div>

<div class="footer">
    <h1>WANT MORE? OF COURSE YOU DO.</h1>
    <h3>
        Join our squad for exclusive access to must-have product releases,
        trending news, boutique & updates.
    </h3>
    <div class="social">
        <a href="#">facebook</a>
        <a href="#">instagram</a>
        <a href="#">youtube</a>
    </div>
    <ul>
        <li><a href="#">FAQ</a></li>
        <li><a href="#">Shipping & returns</a></li>
        <li><a href="#">terms</a></li>
        <li><a href="#">privacy</a></li>
        <li><a href="#">my account</a></li>
        <li><a href="#">about us</a></li>
        <li><a href="#">contact us</a></li>
    </ul>
    <h6>Made by Julia 2019.03</h6>
</div>
</body>
</html>
