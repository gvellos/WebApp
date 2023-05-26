<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cinema</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<br/>
<div class="center">
    <h1>Login</h1>
    <form method="POST" action="ServletLogin" id="form"> <!-- Update the form action -->
        <div class="txt_field">
            <input type="text" name="name" required> <!-- Add the name attribute -->
            <span></span>
            <label>Name</label>
        </div>
        <div class="txt_field">
            <input type="text" name="username" required> <!-- Add the name attribute -->
            <span></span>
            <label>Username</label>
        </div>
        <div class="txt_field">
            <input type="password" name="password" required> <!-- Add the name attribute -->
            <span></span>
            <label>Password</label>
        </div>
        <input type="submit" value="Login" onclick="register(event)">
        <div class="signup_link">
            Not a member? <a href="signup.jsp">Signup</a>
        </div>
    </form>
</div>
<script>
    var form = document.getElementById("form");

    function register(event){
    event.preventDefault();
    form.submit();
}
</script>
</body>
</html>
