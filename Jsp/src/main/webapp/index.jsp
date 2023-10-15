<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>
Main page
<a href="<%= request.getContextPath() %>/Controller?page=login">Login</a><br>
<a href="<%= request.getContextPath() %>/Controller?page=sign">sign</a><br>
<a href="<%= request.getContextPath() %>/Controller?page=about">About</a><br>
</body>
</html>