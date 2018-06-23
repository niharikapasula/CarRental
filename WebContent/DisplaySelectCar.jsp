<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url(n.jpg);
background-size:cover;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 80%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<p><br></p>
	<center>
	<table border=5>
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
			<tr>
				<td>${Car.carId }</td>
				<td>${Car.carModel }</td>
				<td>${Car.seats }</td>
				<td>${Car.rentPerDay }</td>
				<td>${Car.driverName }</td>
				<td>${Car.driverMobileNo }</td>
				<td>${Car.giverId }</td>
				<td><a href="DeleteCar?Id=${Car.carId }">Book</a></td>
			</tr>
	</table>
	</center>
	

</body>
</html>