<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>Bootstrap 101 Template</title>   
   <!--  <link href="css/bootstrap.css" rel="stylesheet">   -->
		
	<style type="text/css">
	
	<%@include file="css/bootstrap.css" %>
	</style>
	
  </head>
  <body>  
	  
<div class="container">
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>    
    <script src="bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){		
			
		});	
	</script>	
  </body>
</html>