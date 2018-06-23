<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
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
</head>
<body>

<ul>
  <li><a class="active" href="#carrentals">Car Rentals</a></li>
  <li><a href="HomePage.jsp">Home</a></li>
  <li><a href="aboutus.html">AboutUs</a></li>
  <li><a href="AddOn.html">Add On</a></li>
  <li style="float:right"><a class="active" id="myBtn1">SignUp</a></li>
  <li style="float:right"><a class="active" id="myBtn">Login</a></li>
</ul>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<div class="container1">
    
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item ">
      
        <img src="Car-Rental2.jpg" alt="Car Rentals" style="width:100%;">
      </div>

      <div class="item">
        <img src="car-rental4.jpg" alt="Car Rentals" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="car-rental-5-cars.png" alt="Car Rentals" style="width:100%;">
      </div>
    </div>
    </div>
    <div class="container">

  
  <!-- Modal -->
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Login</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
        <form action = "userLoginServlet" method = "POST">
          <div class="form-group">
      <label for="userName">USERNAME:</label>
      <input type="userName" class="form-control" id="userName" placeholder="Enter username" name="userName" required>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password" required>
    </div>
    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>

       <!-- Modal -->
  <div class="modal fade" id="myModal1" role ="dialog" ">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Register</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          
           <form action = "RegisterServlet" method = "POST">
           <div class="form-group">
      <label for="userName">UserName:</label>
      <input type="userName" class="form-control" id="userName" placeholder="Enter username" name="userName" required>
    </div>
    <div class="form-group">
      <label for="emailId">emailId:</label>
      <input type="emailId" class="form-control" id="emailId" placeholder="Enter emailId" name="emailId" required>
    </div>
     <div class="form-group">
      <label for="mobileNo">mobileNo:</label>
      <input type="mobileNo" class="form-control" id="mobileNo" placeholder="Enter MobileNumber" name="mobileNo" required>
    </div>
    <div class="form-group">
      <label for="password">password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password" required>
    </div>

    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>

    <script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("item");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
$(document).ready(function(){
	    $("#myBtn").click(function(){
	        $("#myModal").modal();
	    });
	    $("#myBtn1").click(function(){
	        $("#myModal1").modal();
	    });
	});
</script>
  </div>
</div>
</body>
</head>
</html>