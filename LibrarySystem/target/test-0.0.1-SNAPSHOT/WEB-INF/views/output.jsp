<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car</title>
</head>
<body>
	<div align="center">
		Car List
		<table border="1">
			<tr>
				<th>model</th>
				<th>year</th>

			</tr>

			<c:forEach var="car" items="${carList}">
				<tr>
					<td><c:out value="${car.model}"></c:out></td>
					<td><c:out value="${car.year}"></c:out></td>
				</tr>
			</c:forEach>

		</table>


	</div>
</body>
</html>