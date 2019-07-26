<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<style type="text/css">
.error{color:red}
</style>
</head>
<body bgcolor="pink">
<form:form action="process" modelAttribute="customer">
First Name(*): <form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"/><br><br>
Last Name: <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/><br><br>
Free passes: <form:input path="passes"/>
<form:errors path="passes" cssClass="error"/>
<br><br>
 post code:<form:input path="postalcode"/>
 <form:errors path="postalcode" cssClass="error"/><br><br>
 
 course code:<form:input path="courseCode"/>
 <form:errors path="courseCode" cssClass="error"/><br><br>
 
<input type="submit"value="submit"/>


</form:form>

</body>
</html>