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
			
			<ul class="nav nav-tabs nav-justified">
				<li class="active">
					<a href="#homeContent" data-toggle="tab">Home</a>
				</li>
				<li>
					<a href="#contactContent" data-toggle="tab">contact</a>
				</li>
				<li class="dropdown">
					<a href="#" data-toggle="dropdown" class="dropdown-toggle">
						Locations <b class="caret"></b>
					</a>
					<ul class="dropdown-menu">
						<li>
							<a href="#IndiaContent" data-toggle="tab">India</a>
						</li>
						<li>
							<a href="#usaContent" data-toggle="tab">USA</a>
						</li>
					</ul>
				</li>
			</ul>
			
			<div class="tab-content">
				<div class="tab-pane active fade in" id="homeContent">
					<h3>Home page</h3>
					<p>home data</p>
				</div>
			
				<div class="tab-pane fade" id="contactContent">
					<h3>Contact page</h3>
					<p>contact data</p>
				</div>
			
				<div class="tab-pane fade" id="IndiaContent">
					<h3>INDIA page</h3>
					<p>India data</p>
				</div>
			
				<div class="tab-pane fade" id="usaContent">
					<h3>Usa page</h3>
					<p>usa data</p>
				</div>
			</div>
			
		
		
		</div>
	</div> 

	
</div>
   
  </body>
</html>