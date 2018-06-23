<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
<body >
<ul>
  <li><a class="active" href="#carrentals">Car Rentals</a></li>
  <li><a href="HomePage.jsp">Home</a></li>
  <li><a href="aboutus.html">AboutUs</a></li>
  <li><a href="AddOn.html">Add On</a></li>
  <li style="float:right"><a class="active" id="myBtn1" href = "HomePage.jsp">LogOut</a></li>
  
</ul>
<center>
 <p><br></p>
 <h1><marquee>welcome to CarGiver home panel</marquee></h1>
 <div class="container">
  
  <button type="button" class="btn btn-default btn-lg" id="myBtn">Add Car</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:5px 5px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span>AddCar</h4>
        </div>
        <div class="modal-body" style="padding:10px 10px;">
          <form action = "AddCar" method = "POST">
            <div class="form-group">
              <label for="carModel"><span class="fa fa-car"></span> Car Model</label>
              <input type="carModel" class="form-control" id="CarModel" placeholder="Enter CarModel"name="carModel" required>
            </div>
            <div class="form-group">
              <label for="seats"><span class="fa fa-car"></span>No of Seats</label>
              <input type="seats" class="form-control" id="seats" placeholder="Enter seats" name="seats" required>
            </div>
            <div class="form-group">
              <label for="rentPerDay"><span class="fa fa-car"></span> Rent Per Day</label>
              <input type="rentPerDay" class="form-control" id="rentPerDay" placeholder="Enter rentPerDay" name="rentPerDay" required>
            </div>
            <div class="form-group">
              <label for="driverName"><span class="fa fa-car"></span> Driver Name</label>
              <input type="driverName" class="form-control" id="driverName" placeholder="Enter driverName"name="driverName" required>
            </div>
            <div class="form-group">
              <label for="driverMobileNo"><span class="fa fa-car"></span> Driver Mobile Number</label>
              <input type="driverMobileNo" class="form-control" id="driverMobileNo" placeholder="Enter driverMobileNo" name="driverMobileNo" required>
            </div>
            <div class="form-group">
              <label for="giverId"><span class="fa fa-car"></span> GiverId</label>
              <input type="giverId" class="form-control" id="giverId" placeholder="Enter giverid" name="giverId" required>
            </div>
             <input type="submit" name="s" value="Add"/>
          </form>
        </div>
        
      </div>
      
    </div>
  </div> 
</div>
</center>
<script>
$(document).ready(function(){
	    $("#myBtn").click(function(){
	        $("#myModal").modal();
	    });
	    $("#myBtn1").click(function(){
	        $("#myModal1").modal();
	    });
	});
</script>
 </body>

</html>