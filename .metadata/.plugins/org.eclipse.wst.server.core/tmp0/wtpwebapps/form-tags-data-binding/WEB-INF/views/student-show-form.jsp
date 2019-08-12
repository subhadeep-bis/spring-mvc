<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="processForm" modelAttribute="student">
		First Name:<form:input path="firstName" />
		<br/><br/>
		Last Name:<form:input path="lastName" />
		<br/><br/>
		Country:	<form:select path="country" >
						<form:options	items="${student.countries }" />
					</form:select>
		<br/><br/>
		Favorite Language: 
			Java: <form:radiobutton path="favoriteLang" value="Java"/>
			C#:	<form:radiobutton path="favoriteLang" value="C#"/>
			Python: <form:radiobutton path="favoriteLang" value="Python"/>
		<br/><br/>
		Experience in OSs:
			Windows: <form:checkbox path="experience" value="Windows"/>
			Linux: <form:checkbox path="experience" value="Linux"/>
			Mac OS: <form:checkbox path="experience" value="Mac OS"/>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>