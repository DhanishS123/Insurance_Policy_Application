<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="dashboard" method="post">
<label for="id">Enter id</label><br> 
<input type="number" id="user_id" name="user_id" required><br> 
<label for="password">Enter Password</label><br> 
<input type="text" id="password" name="password" required><br>
<input type="submit" value="submit"> <br><br>
</form>
<p>error</p> <!-- Display error message if authentication fails -->
    <p>Don't have an account? <a href="signUp">Sign Up</a></p>
</body>
</html>