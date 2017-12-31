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
					<h1 align="center">XYZ Hospital Login Here</h1>
		</div>
	</div>
	<hr>
	<br>
	<br>
	<div class="row">
		<div class="col-xs-12" style="min-height:500px;">
					<div class="col-xs-4"></div>
					
					<div class="col-xs-4">
				<form action="/login" method="post">
					<div class="form-group">
						<label for="inputUserName">UserName</label>
						<input class="form-control" placeholder="Username" type="text" id="InputUserName"/>
					</div>
					<div class="form-group">
						<label for="inputPassword">Password</label>
						<input class="form-control" placeholder="password" type="password" id="Enter the password"/>
					</div>
					<div class="form-group">
						<label for="gender">Gender</label>
						<select id="selectGender" class="form-control">
							<option>Admin</option>
							<option>Doctor</option>
							<option>Receptionist</option>
							<option>Patent</option>
						</select>
					</div>
						<button class="btn btn-default" type="submit">Login</button>
				</form>
				</div>
					
					
		</div>
	</div>

	
</div>
   
  </body>
</html>