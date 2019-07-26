<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student Confirmed : ${student.fname} ${student.lname}
country: ${student.country}
Course :${student.favoriteLanguage}
I like to use : 
<ul>
<c:forEach var="temp" items="${student.operationSystem}">

<li>${temp}</li>

</c:forEach>
</ul>



</body>
</html>