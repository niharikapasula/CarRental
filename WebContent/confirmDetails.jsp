<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    float:center;
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
<title>Insert title here</title>

</head>
<body>
${customer }
<center>
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
			<tr>
				<td>${customer.carId }</td>
				<td>${customer.carModel }</td>
				<td>${customer.seats}</td>
				<td>${customer.rentPerDay }</td>
				<td>${customer.driverName}</td>
				<td>${customer.driverMobileNo }</td>
				<td>${customer.giverId }</td>
                <td><a href="DeleteCar?id=${customer.carId }"  >Book</a></td>
				</tr>
	</table>
	</center>
				
</body>
</html>