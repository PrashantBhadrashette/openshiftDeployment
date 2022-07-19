<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register User</title>
</head>
<body>
<h2>User Registration:</h2>
<form action="registerUser" method="post">
<pre>
First Name: <input type="text" name="FIRST_NAME"/>
Last Name:  <input type="text" name="LAST_NAME"/>
User Name: <input type="text" name="EMAIL"/>
Password: <input type="password" name="PASSWORD"/>
Confirm Password: <input type="password" name="confirmPassword"/>
<input type="submit" value="register"/>
</pre>
</form>

</body>
</html>