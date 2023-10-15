<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1>Upload File Form</h1>
 <form  action="FileUpload" enctype="multipart/form-data" method="post">
 
 Select<input type="file" name="file2" /><br>
 <input type="submit" value="upload" />
 </form>
 
 
 
 
 <%
 String file_name=(String)request.getParameter("filename");
 if(file_name!=null){
 out.println(" File uploaded successfuly");
 }   
 %>

</body>
</html>
