<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DISPLAY Route</title>
</head>
<body>
	<h2>ROUTE SEARCH RESULTS</h2>
	
	<table border="5">
		<tr>
		 
			<th>SOURCE</th>
			<th>DESTINATION</th>
			<th>DATE</th>
			<!-- <th>BASIC FARE</th>
			<th>GST</th>
			<th>TOTAL</th> -->
			
		</tr>
		<c:forEach var="findRoute" items="${findRoute}">
			<tr>
				<td>${findRoute.source}</td>
				<td>${findRoute.destination}</td>
				<td>${findRoute.date}</td>
				<!-- <td>${findFare.basicFare}</td>
				<td>${findFare.gst}</td>
				<td>${findFare.total}</td> -->
				
			</tr>

		</c:forEach>
	</table>
</body>
</html>