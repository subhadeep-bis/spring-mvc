<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	First Name: ${student.firstName }
	<br/><br/>
	Last Name: ${student.lastName }
	<br/><br/>
	Country: ${student.country }
	<br/><br/>
	Favorite Language: ${student.favoriteLang }
	<br/><br/>
	Experience in OS: 
	<ul>
		<c:forEach var="os" items="${student.experience }" >
			<li>${os } </li>
		</c:forEach>
	</ul>
	<br/><br/>
</body>
</html>