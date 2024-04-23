<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
<label for="user_id">Enter id</label><br> 
<input type="number" id="user_id" name="user_id" required><br> 
<label for="password">Enter Password</label><br> 
<input type="password" id="password" name="password" required><br>
<label for="name">Enter name</label><br> 
<input type="text" id="name" name="name" required><br>
<label for="number">Enter number</label><br> 
<input type="number" id="number" name="number" required><br> 
<input type="submit" value="submit"> 
</form>
</body>
</html>