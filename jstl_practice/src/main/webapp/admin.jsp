<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>Bootstrap 101 Template</title>   
    
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"> -->
	 <link href="css/customCss.css" type="text/css" rel="stylesheet">  
	<link href="css/bootstrap.css" type="text/css" rel="stylesheet">
	
	
	<style type="text/css">
	
	<%-- <%@include file="css/customCss.css" %>
	<%@include file="css/bootstrap.css" %> --%>
	
	/* .customDiv{
	margin:2px;
	background-color:silver;
	min-height:200px;  /* height of the grid*/
	text-align:center;
	font-size:large; */
}
	</style>
	
  </head>
  <body>  
	  
    
    
<div class="container">

	<div class="row">
		<div class="col-md-2">
			<div class="customDiv">


 <c:set var="myname" scope="session" value="${'src/main/webapp/bootstrap.css'}"/>
 ${myname}

</div>
		</div>
		<div class="col-md-4">
			<div class="customDiv"> ${pageContext.request.contextPath} </div>
		</div>
		<div class="col-md-4">
			<div class="customDiv">Main content </div>
		</div>
		<div class="col-md-2">
			<div class="customDiv">Right side</div>	
		</div>
	</div>
	
<hr>

<div class="row">
		<div class="col-md-2">
			<div class="customDiv">Left side</div>
		</div>
		<div class="col-md-4">
			<div class="customDiv"> Main content </div>
		</div>
		<div class="col-md-4">
			<div class="customDiv">Main content </div>
		</div>
		<div class="col-md-2">
			<div class="customDiv">Right side</div>	
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