<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="studentconfirmation" modelAttribute="student">
First Name: <form:input path="fname"/><br><br>
Last Name: <form:input path="lname"/><br><br>
Country : <form:select path="country"><br><br>
<form:options items="${student.countries}"/><br>
</form:select><br><br>
Favorite language :
<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOption}"  />




<br><br>

Operating System:
Linux<form:checkbox path="operationSystem" value="Linux"/>
Unix<form:checkbox path="operationSystem" value="Unix"/>
Mac<form:checkbox path="operationSystem" value="mac"/>
Windows<form:checkbox path="operationSystem" value="Windows"/>
<%--

java <form:radiobutton path="favoriteLanguage" value="java" />
sql <form:radiobutton path="favoriteLanguage" value="sql" />
.net <form:radiobutton path="favoriteLanguage" value=".net" />
python <form:radiobutton path="favoriteLanguage" value="python" />

			


 <form:option value="INDIA" label="india"></form:option>
<form:option value="UK" label="uk"></form:option>
<form:option value="USA" label="usa"></form:option> --%>




<input type="submit"value="submit"/>

</form:form>

</body>
</html>