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
	<form method="GET" action="processForm" style="border: 1px solid black; padding: 20px">
		Enter Your Name: <input type="text" name="studentName" id="studentName" placeholder="Name"/>
		<button type="submit">Submit</button>
		<input type="submit" formaction="processFormVersionTwo" value="Click to Shout!">
		<input type="submit" formaction="processFormVersionThree" value="RequestParam Annotation" />
	</form>
</body>
</html>