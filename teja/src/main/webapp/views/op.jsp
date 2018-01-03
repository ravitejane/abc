<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
  
	   
    <title>OutPatent Register</title> 
 
	   <!--  <link href="css/bootstrap.css" rel="stylesheet">  
		<link href="css/customCss3.css" rel="stylesheet">  -->
		
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
					<h1 align="center">XYZ Register Here</h1>
			</div>
		</div>
		<hr>
		<br>
		<br>
		<div class="row">
		<div class="col-xs-12" style="min-height:500px;">
					<div class="col-xs-4"></div>					
					<div class="col-xs-4">
						<form action="/teja/opRegister" method="post">
				
							<div class="form-group">
								<label for="inputUserName">UserName</label>
								<input class="form-control" placeholder="Username" name="username" type="text" id="InputUserName"/>
							</div>
							<div class="form-group">
								<label for="inputPassword">Password</label>
								<input class="form-control" placeholder="Password" name="password" type="password"/>
							</div>
							<div class="form-group">
								<label for="inputDateOfBirth">DOB</label>
								<input class="form-control" placeholder="DOB" name="dob" type="date" id="dob"/>
							</div>
					
							<div class="form-group">
								<label for="inputEmail">Email</label>
								<input class="form-control" placeholder="email" name="email" type="email" id="InputEmail"/>
							</div>
					
							<div class="form-group">
								<label for="inputnumber">Phone number</label>
								<input class="form-control" placeholder="Phone number" name="phonenumber" type="number" id="Inputnumber"/>
							</div>
							<div class="form-group">
								<label for="gender">gender</label>
								<select id="selectGender" name="gender" class="form-control">
									<option>male</option>
									<option>female</option>
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