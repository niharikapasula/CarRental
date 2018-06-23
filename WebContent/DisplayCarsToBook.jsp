<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url(n.jpg);
background-size:cover;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    float:center;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style><title>Insert title here</title>

</head>
<body>
<p><br></p>

	<table border=1>
		<tr>
			<th>CarId</th>
			<th>Car Model</th>
			<th>No of Seats</th>
			<th>Rent Per Day</th>
			<th>Driver Name</th>
			<th>Driver Mobile Number</th>
			<th>GiverId</th>
			<th>Book</th>
		</tr>
		<c:forEach items="${customerList}" var="customer">
			<tr>
				<td>${customer.carId }</td>
				<td>${customer.carModel }</td>
				<td>${customer.seats}</td>
				<td>${customer.rentPerDay }</td>
				<td>${customer.driverName}</td>
				<td>${customer.driverMobileNo }</td>
				<td>${customer.giverId }</td>
				<td><a href="SelectCar?id=${customer.carId }">Select</a></td>
			  	
			</tr>
		</c:forEach>
	</table>


</body>
</html>