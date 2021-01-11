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
	<form:form action="cars/brands" method="GET" modelAttribute="car">
	Brand:&nbsp; 
	<form:select path="brand">
			<c:forEach items="${listBrands}" var="b">
				<form:option value="${b}">${b}</form:option>
			</c:forEach>
		</form:select>
		<br />
		<form:button type="submit">Find Models</form:button>
		<form:button type="button" name="back" onclick="history.back()">Back</form:button>

	</form:form>

</body>
</html>
