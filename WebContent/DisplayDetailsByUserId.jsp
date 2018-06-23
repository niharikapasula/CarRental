<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
<style>
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
<center>
	<table border=1>
		<tr>
			<th>UserId</th>
			<th>User Name</th>
			<th>EmailId</th>
			<th>Mobile Number</th>
			<th>Password</th>
		</tr>
			<tr>
				<td>${User.userId }</td>
				<td>${User.userName }</td>
				<td>${User.emailId }</td>
				<td>${User.mobileNo }</td>
				<td>${User.password }</td>
			</tr>
	</table>
	</center>
<%
   RequestDispatcher requestDispatcher; 
   requestDispatcher = request.getRequestDispatcher("/adminHomePage.jsp");
   requestDispatcher.include(request, response);
%>
	
</body>
</html>