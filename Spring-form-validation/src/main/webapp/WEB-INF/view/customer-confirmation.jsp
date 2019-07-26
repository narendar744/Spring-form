<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer confirmation</title>
</head>
<body bgcolor="blue">

customer is confirmed : ${customer.firstName} ${customer.lastName} have ${customer.passes} passes the postal code of ${customer.postalcode}  and course code id ${customer.courseCode}
</body>
</html>