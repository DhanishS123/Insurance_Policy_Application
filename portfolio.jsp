<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>your policy id is:</p>${policyId }
<p>your id is:</p>${user_id }
<p>your policy name is</p>${policyName }
<p>your policy tenture is:</p>${insuranceTenure }
<p>your sum insure is:</p>${sumInsured }
<p>thank you</p>

<form action="deletePolicy">
<button type="submit">delete policy</button>
</form>
</body>
</html>