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

	<form:form action="success" method="GET" modelAttribute="car">
		<table>
			<tr>
				<th></th>
				<th>Brand</th>
				<th>Model</th>
				<th>Year</th>
				<th>No. of Kms</th>
				<th>Price</th>
				<th>Fuel</th>
			</tr>
			<c:forEach items="${cars}" var="ca">
				<tr>
					<td><input type="radio" name="carId" path="id"
						value="${ca.id }" /></td>
					<td>${ ca.brand}</td>
					<td>${ca.model}</td>
					<td>${ca.year}</td>
					<td>${ca.noKms}</td>
					<td>${ca.price}</td>
					<td>${ ca.fuel}</td>
				</tr>
			</c:forEach>
		</table>
		<form:button type="submit">Book Car</form:button>
		<form:button type="button" name="back" onclick="history.back()">Back</form:button>

	</form:form>
	<form:form action="../index" modelAttribute="car">
		<form:button type="submit">Home</form:button>
	</form:form>
</body>
</html>
