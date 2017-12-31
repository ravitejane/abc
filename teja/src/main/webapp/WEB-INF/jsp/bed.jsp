<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Bed Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1 align="center">
	Add a Bed	
</h1>

<c:if test="${!empty bed.bedNo}">
		
				<c:url var="addAction" value="/bedUpdate"/>
		
		</c:if>
		
		
		<c:if test="${empty bed.bedNo}">
		
				<c:url var="addAction" value="/bed/add"/>
		
		</c:if>

<form:form action="${addAction}" commandName="bed">
	<table style="margin-left: 500px">
	
	<c:if test="${empty bed.bedNo}">
		<tr>
			<td>
				<form:label path="bedNo">
					<spring:message text="bedNo"/>
				</form:label>
			</td>
			<td>
				<form:input path="bedNo"/>
			</td>
		</tr>	
	</c:if>
	<c:if test="${!empty bed.bedNo}">
		<tr>
			<td>
				<form:label path="bedNo">
					<spring:message text="bedNo"/>
				</form:label>
			</td>
			<td>
				<form:input path="bedNo" disabled="true" readonly="true"/>
				<form:hidden path="bedNo" />
			</td>
		</tr>	
	</c:if>
	
		<tr>
			<td>
				<form:label path="roomNo">
					<spring:message text="roomNo"/>
				</form:label>
			</td>
			<td>
				<form:input path="roomNo"/>
			</td>		
		</tr>	
		
		
		<tr>
			<td>
				<form:label path="wardName">
					<spring:message text="wardName"/>
				</form:label>
			</td>
			<td>
				<form:input path="wardName"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="roomType">
					<spring:message text="roomType"/>
				</form:label>
			</td>
			<td>
				<form:input path="roomType"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="charge">
					<spring:message text="charge"/>
				</form:label>
			</td>
			<td>
				<form:input path="charge"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="status">
					<spring:message text="status"/>
				</form:label>
			</td>
			<td>
				<form:input path="status"/>
			</td>
		</tr>
		
		<tr>
		<td colspan="2">
		<c:if test="${!empty bed.bedNo}">
		
				<input type="submit" value='<spring:message text="Edit Bed"/>'/>
		
		</c:if>
		
		
		<c:if test="${empty bed.bedNo}">
		
				<input type="submit" value='<spring:message text=" Save Bed"/>'>
		
		</c:if>
		</td>
		</tr>		
	</table>
</form:form>
<br>
<hr>
<br>
<h3 align="center">Bed List</h3>
<c:if test="${!empty listBeds}">
	<table class="tg" style="margin-left: 300px">
		<tr>
			<th>Bed No</th>
			<th>Room No</th>
			<th>Ward Name</th>
			<th>Room Type</th>
			<th>Charge Per Day</th>
			<th>Booking Status </th>		
			<th>Edit</th>
			<th>Remove</th>	
		</tr>	
		<c:forEach items="${listBeds}" var="bed">
		<tr>
			<td>${bed.bedNo}</td>
			<td>${bed.roomNo}</td>
			<td>${bed.wardName}</td>
			<td>${bed.roomType}</td>
			<td>${bed.charge}</td>
			<td>${bed.status}</td>
			<td><a href='<c:url value="/editBed/${bed.bedNo}"/>'>Edit</a></td>
			<td><a href='<c:url value="/removeBed/${bed.bedNo}"/>'>Delete</a></td>
		</tr>
		
		</c:forEach>
	</table></c:if>

</body>
</html>