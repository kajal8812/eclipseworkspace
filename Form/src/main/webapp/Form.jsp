<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Tag</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/Controller" method="get">
Name: <input type="text" name="name" required><br>
Gender: <input type="radio" name="gender" value="male">Male
        <input type="radio" name="gender" value="female" checked="checked">Female
        <br>
Languages known:<input type="checkbox" name="language" value="english">English
<input type="checkbox" name="language" value="hindi">Hindi
<input type="checkbox" name="language" value="french">French
<br>
Country:
<select name="country">
<option value="india">India </option>
<option value="usa">USA </option>
<option value="uk">UK </option>
<option value="australia">Australia </option>



</select>


<br>


submit:<input type="submit">


<br>
</form>
</body>
</html>