<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<form action="/spring-mvc/login" method="post">
	Enter your name <input type="text" name="name"/> 
	Enter your password <input type="password" name="password"/>
	<input type="submit" value="login"/> 
</form>
</body>
</html>