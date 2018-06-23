<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
body{
background-image:url(n.jpg);
background-size:cover;
}

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
</head>
<body>
<p><br></p>
<center>
	<table border=1>
		<tr>
			<th>GiverId</th>
			<th>Giver Name</th>
			<th>EmailId</th>
			<th>Mobile Number</th>
			<th>Password</th>
			<th>Delete</th>
			
		</tr>
		<c:forEach items="${customerList}" var="customer">
			<tr>
				<td>${customer.giverId }</td>
				<td>${customer.giverName }</td>
				<td>${customer.emailId }</td>
				<td>${customer.mobileNo }</td>
				<td>${customer.password }</td>
				<td><a href="DeleteCarGiver?id=${customer.giverId }">Delete</a></td>
				
			</tr>
		</c:forEach>
	</table>
</center>

</body>
</html>