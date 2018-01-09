<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	
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
				<a class="btn btn-primary" href="/teja/bookAppointment">Book Appointment</a>
				<a class="btn btn-primary" href="/teja/editProfile">Edit Profile</a>
				<a class="btn btn-primary" href="/teja/statusOfAppointment">Status of Appointment</a>
				<a class="btn btn-primary" href="#">Logout</a>
			</div>		
		
		</div>
	</div> 
	<div class="row">
		<div class="col-xs-12">
		
		
		
		
		<h1>
	Add a Doctor	
</h1>
<c:url var="addAction" value="/opUpdate"/>
<form:form action="${addAction}" commandName="outPatent">
	<table>
	
	
		<tr>
			<td>
				<form:label path="patentId">
					<spring:message text="patentId"/>
				</form:label>
			</td>
			<td>
				<form:input path="patentId" readonly="true" size="8" disabled="true"/>
				<form:hidden path="patentId"/>
			</td>
		</tr>	
	
	
		<tr>
			<td>
				<form:label path="name">
					<spring:message text="name"/>
				</form:label>
			</td>
			<td>
				<form:input path="name"/>
			</td>		
		</tr>	
		
		
		<tr>
			<td>
				<form:label path="phoneNo">
					<spring:message text="PhoneNo"/>
				</form:label>
			</td>
			<td>
				<form:input path="phoneNo"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="dateOfBirth">
					<spring:message text="dateOfBirth"/>
				</form:label>
			</td>
			<td>
				<form:textarea path="dateOfBirth"/>
			</td>
		</tr>
		
		
		<tr>
			<td>
				<form:label path="address">
					<spring:message text="address"/>
				</form:label>
			</td>
			<td>
				<form:textarea path="address"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="gender">
					<spring:message text="gender"/>
				</form:label>
			</td>
			<td>
				<form:input path="gender"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="email">
					<spring:message text="email"/>
				</form:label>
			</td>
			<td>
				<form:input path="email"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="bloodGroup">
					<spring:message text="bloodGroup"/>
				</form:label>
			</td>
			<td>
				<form:input path="bloodGroup"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="occupation">
					<spring:message text="occupation"/>
				</form:label>
			</td>
			<td>
				<form:input path="occupation"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="maritalStatus">
					<spring:message text="maritalStatus"/>
				</form:label>
			</td>
			<td>
				<form:input path="maritalStatus"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="appointmentDate">
					<spring:message text="appointmentDate"/>
				</form:label>
			</td>
			<td>
				<form:input path="appointmentDate"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="precption">
					<spring:message text="precption"/>
				</form:label>
			</td>
			<td>
				<form:input path="precption"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="doctorName">
					<spring:message text="doctorName"/>
				</form:label>
			</td>
			<td>
				<form:input path="doctorName"/>
			</td>
		</tr>
		
		
		
		
		
		
		<tr>
		<td colspan="2">		
				<input type="submit" value='<spring:message text=" Save Details"/>'>		
		</td>
		</tr>		
	</table>
</form:form>
		
		
		
		
		
		
		
		
		
		
		</div>
	</div>
	
</div>
   
  </body>
</html>