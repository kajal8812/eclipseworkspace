<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>submit</title>
</head>
<body>

Name: <%= request.getParameter("name") %><br>
Gender: <%= request.getParameter("gender") %><br>
Language: <%String[] languages=request.getParameterValues("language") ;
if(languages!=null){
for(int i=0;i<languages.length;i++){
	out.print("<br>");
	out.print(languages[i]);
	
}}
else
	out.print("none selected");
%><br>

country: 
<%=request.getParameter("country") %> <br>
</body>
</html>