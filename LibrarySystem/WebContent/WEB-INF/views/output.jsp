<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
	<div align="center">
		Book List
		<table border="1">
			<tr>
				<th>Title</th>
				<th>Type</th>

			</tr>

			<c:forEach var="book" items="${bookList}">
				<tr>
					<td><c:out value="${book.title}"></c:out></td>
					<td><c:out value="${book.type}"></c:out></td>
				</tr>
			</c:forEach>

		</table>


	</div>
</body>
</html>