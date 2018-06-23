<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body{
background-image:url(j.jpg);
background-size:cover;
}
a{
font-color:black;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
    font-color:white
}

li {
    float: left;
}
li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover{
    background-color: green;
}
 .modal-header, h4, .close {
      background-color: #5cb85c;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }



</style>

<title>Insert title here</title>
</head>
<%
String userName=(String)session.getAttribute("loggedUser");
%>
<body text=black >
<ul>
  <li><a class="active" href="#carrentals">Car Rentals</a></li>
  <li><a href="HomePage.jsp">Home</a></li>
  <li><a href="aboutus.html">AboutUs</a></li>
  <li><a href="AddOn.html">Add On</a></li>
  <li style="float:right"><a class="active" id="myBtn1" href = "HomePage.jsp">LogOut</a></li>
  
</ul>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<center>
<p><br></p>
 <h1><marquee>Welcome to User Home Page!</marquee></h1>
 <p><br></p>
 <p><br></p>
 <a href = "DisplayCarsToBookServlet">BookNow</a></br>
 <a href="Feedback.html">FeedBack</a>
 </center>
 </body>

</html>