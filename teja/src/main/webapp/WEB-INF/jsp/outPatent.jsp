<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>Bootstrap 101 Template</title>   
    
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"> -->
	<!--  <link href="css/customCss.css" type="text/css" rel="stylesheet">  
	<link href="css/bootstrap.css" type="text/css" rel="stylesheet">  -->
	
	
	<style type="text/css">
	
	<%@include file="css/bootstrap.css" %>
	
	 .customDiv{
	margin:2px;
	background-color:silver;
	min-height:200px;  /* height of the grid*/
	text-align:center;
	font-size:large; 
}
	</style>
	
  </head>
  <body>  
	  
    
    
<div class="container">

	<div class="row">
		<div class="col-xs-12" style="min-height:50px">
					<h1 align="center">XYZ Out Patent Portal</h1>
		</div>
	</div>	
	<hr>
	<div class="row">
		<div class="col-xs-12">
			
			<div class="btn-group btn-group-justified">
				<a class="btn btn-primary" href="/teja/bookAppointment/${patent.patentId}">Book Appointment</a>
				<a class="btn btn-primary" href="/teja/editProfile/${patent.patentId}">Edit Profile</a>
				<a class="btn btn-primary" href="/teja/statusOfAppointment/${patent.patentId}">Status of Appointment</a>
				<a class="btn btn-primary" href="#">Logout</a>
			</div>		
		
		</div>
	</div> 
	<div class="row">
		<div class="col-xs-12">
		<h2>${patent.patentId}</h2>
		<h2>${patent.name}</h2>
		<h2>${patent.email}</h2>
		</div>
	</div>
	
</div>
   
  </body>
</html>