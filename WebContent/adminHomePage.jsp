<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	String userName=(String)session.getAttribute("loggedUser");
%>

<style>
body{
background-image:url(j.jpg);
background-size:cover;
}


ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
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
.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 120px;
    background-color: indigo;
    font-family: inherit;
    margin: 0;
}

li a:hover, .dropdown:hover .dropbtn{
    background-color: green;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color:white;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    index: 1;
    
}

.dropdown-content a {
    float: center;
    color: black;
    padding: 14px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: green;
}

.dropdown:hover .dropdown-content {
    display: block;
    li a:hover{
    background-color: green;
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

<body  >
<ul>
  <li><a class="active" href="#carrentals">Car Rentals</a></li>
  <li><a href="HomePage.jsp">Home</a></li>
  <li><a href="aboutus.html">AboutUs</a></li>
  <li><a href="AddOn.html">Add On</a></li>
  <li style="float:right"><a href = "HomePage.jsp" class="active" id="myBtn1">LogOut</a></li>
  
</ul>
<center>
		<h3>
		<p><br></p>
		<h1><marquee>welcome to admin Home </marquee></h1>
		<p><br></p>
	<div class="dropdown">
    <button class="dropbtn"> UserDetails
      <i class="fa fa-caret-down"></i>
    </button>
    
    <div class="dropdown-content">
    
      <a href="DetailByUserId.html">Get User by Id</a>
      <a href="DisplayAllUserServlet">Display all Users</a>
        </div>
  </div> 
  <div class="dropdown">
    <button class="dropbtn">CarGiverDetails
      <i class="fa fa-caret-down"></i>
    </button>
    
    <div class="dropdown-content">
      <a href="displayCarGiverDetails.html">Get Car-Giver by Id</a>
      <a href="DisplayAllCarGivers">Display all Car-Givers</a>
      <a href="CarGiver.html">Add new Car-Giver</a>
    
        </div>
  </div>
  <div class="dropdown">
    <button class="dropbtn">CarDetails
      <i class="fa fa-caret-down"></i>
    </button>
    
    <div class="dropdown-content">
      <a href="DisplayCarDetailsById.html">Get Car by Id</a>
      <a href="DisplayAllCarDetails">Get all Details of Cars</a>
        <a href="AddCarByAdmin.html">Add a Car</a>
         </div>
  </div>
  <div class="dropdown">
    <button class="dropbtn">Feedback
      <i class="fa fa-caret-down"></i>
    </button>
    
    <div class="dropdown-content">
      <a href="AllFeedbackServlet">All Feedback</a>
      
         </div>
  </div>
	</center>
	</div>
	</div>
	</form>	
</body>

</html>