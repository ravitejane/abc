<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Person Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Doctor	
</h1>
<c:url var="addAction" value="/doctor/add"/>
<form:form action="${addAction}" commandName="doctor">
	<table>
	
	<c:if test="${!empty doctor.name}">
		<tr>
			<td>
				<form:label path="dId">
					<spring:message text="dId"/>
				</form:label>
			</td>
			<td>
				<form:input path="dId" readonly="true" size="8" disabled="true"/>
				<form:hidden path="dId"/>
			</td>
		</tr>	
	</c:if>
	
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
				<form:label path="specialization">
					<spring:message text="specialization"/>
				</form:label>
			</td>
			<td>
				<form:input path="specialization"/>
			</td>
		</tr>
		
		<tr>
		<td colspan="2">
		<c:if test="${!empty doctor.name}">
		
				<input type="submit" value='<spring:message text="Edit Doctor"/>'/>
		
		</c:if>
		
		
		<c:if test="${empty doctor.name}">
		
				<input type="submit" value='<spring:message text=" Save Doctor"/>'>
		
		</c:if>
		</td>
		</tr>		
	</table>
</form:form>

<h3>Doctors List</h3>
<c:if test="${!empty listDoctors}">
	<table class="tg">
		<tr>
			<th>Doctor Id</th>
			<th>Name</th>
			<th>Phone No</th>
			<th>Address</th>
			<th>Specialization</th>		
			<th>Edit</th>
			<th>Remove</th>	
		</tr>	
		<c:forEach items="${listDoctors}" var="doctor">
		<tr>
			<td>${doctor.dId}</td>
			<td>${doctor.name}</td>
			<td>${doctor.phoneNo}</td>
			<td>${doctor.address}</td>
			<td>${doctor.specialization}</td>
			<td><a href='<c:url value="/edit/${doctor.dId}"/>'>Edit</a></td>
			<td><a href='<c:url value="/remove/${doctor.dId}"/>'>Delete</a></td>
		</tr>
		
		
		</c:forEach>
	</table>


</c:if>






















</body>
</html>