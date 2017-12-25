<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" commandName="person">
	<table>
		<tr>
			<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>				
			</td>
			
			<td>
			<form:input path="id"/>
			</td>		
		</tr>
		<tr>
			<td>
				<form:label path="name">
					<spring:message text="Name"/>
				</form:label>
			</td>
			<td>
				<form:input path="name"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="country">
					<spring:message text="Country"/>
				</form:label>
			</td>
			<td>
				<form:input path="country"/>
			</td>
		</tr>
		<tr >
			<td colspan="2">
				<c:if test="${empty person.name}">
					<input type="submit" value='<spring:message text="edit"/>'>
				</c:if>
				
				<c:if test="${!empty person.name }">
					<input type="submit" value='<spring:message text="save"/>'>
				</c:if>
			</td>
			<td><a href="<c:url value='/edit'/>" >Edit</a></td>
		</tr>
	
	</table>

</form:form>
</body>
</html>