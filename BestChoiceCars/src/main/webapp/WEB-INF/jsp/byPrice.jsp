<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01  
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html;  
 charset=ISO-8859-1">
<title>Start Spring MVC</title>
<style>
body {
	background-color: lightblue;
}
</style>
</head>
<body>
	<h1>BestChoice Cars</h1>
	<h2>Choose price range to find available cars</h2>
	<form:form action="cars/price" method="GET" modelAttribute="car">
		<input type="radio" id="radioTrue" name="choice" value="true">
		<label for="radioTrue">&gt;5 lakhs</label>

		<input type="radio" id="radioFalse" name="choice" value="false">
		<label for="radioFalse">&lt;5 lakhs</label>
		<br />
		<form:button type="submit">Find Your Car</form:button>
		<form:button type="button" name="back" onclick="history.back()">Back</form:button>

	</form:form>
</body>
</html>