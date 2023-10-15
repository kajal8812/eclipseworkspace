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
<table border="1" width="1200px">
        <tr>
            <th>Id</th>
            <th>BusinessUnit</th>
            <th>Title</th>
            
            <th>Currency</th>
            <th>BuildingAddress</th>
            <th>Date</th>
            <th>View</th>
        </tr>
        <c:forEach items="${list}" var="l">
            <tr>
                  <td>${l.id }</td>
                <td>${l.businessUnit}</td>
                <td>${l.requisitionTitle}</td>
                
                <td>${l.currency}</td>
                <td>${l.buildingAddress}</td>
                <td>${l.requisitionDate}</td>
                <td><a href="<c:url value='/user/${l.id }/items'/>"> View</a></td>
                
            </tr>
        </c:forEach>
    </table>
</body>
</html>