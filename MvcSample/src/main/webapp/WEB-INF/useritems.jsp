<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red;">Your Information</h2>
 Business Unit: ${user.businessUnit}
 <br>
 Requisition Title: ${user.requisitionTitle}
 <br>
 
Currency: ${user.currency}<br>
Building Address: ${user.buildingAddress}<br>
Requisition Date: ${user.requisitionDate}<br> 
    
    <h2 style="color:Lightblue;">Items you have opted are</h2>
    <table border="1" width="1200px">
        <tr>
            
            <th>Type</th>
            <th>Category</th>
            <th>SubCategory</th>
            <th>ItemName</th>
            <th>Quantity</th>
            <th>EstimatedPrice</th>
        </tr>
        <c:forEach var="item" items="${items}">
            <tr>
                <td>${item.type}</td>
                <td>${item.category}</td>
                <td>${item.subCategory}</td>
                <td>${item.itemName}</td>
                <td>${item.quantity}</td>
                <td>${item.estimatedPrice}</td>
            </tr>
        </c:forEach>
    </table>







</body>
</html>