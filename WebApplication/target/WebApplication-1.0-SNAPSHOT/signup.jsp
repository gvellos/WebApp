<%--
  Created by IntelliJ IDEA.
  User: george_vellos
  Date: 17/5/23
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cinema</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<br/>
<div class="center">
    <h1>Sign up</h1>
    <form method="post" action="index.jsp" >
        <div class="txt_field">
            <input type="text" required>
            <span></span>
            <label>Name</label>
        </div>
        <div class="txt_field">
            <input type="text" required>
            <span></span>
            <label>Username</label>
        </div>
        <div class="txt_field">
            <input type="password" required>
            <span></span>
            <label>Password</label>
        </div>
        <div class="txt_field">
            <input type="password" required>
            <span></span>
            <label>Password again</label>
        </div>
        <input type="submit" value="Login" onclick="location.href='index.jsp';" >
        <br/><br/><br/><br/>
    </form>
</div>
</body>
</html>
