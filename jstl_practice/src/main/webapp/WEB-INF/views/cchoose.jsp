<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body> 
	
	<c:set var="a" scope="session" value="${person.id}"/>
	
	<c:choose>
		<c:when test="${a==519}">
			<c:out value="${'hello raviteja gattineni'}"/>
		</c:when>
		<c:when test="${a==528}">
			<c:out value="${'hello siddharadha'}"/>
		</c:when>
		<c:otherwise>
			<c:out value="${'hello enter correct number'}"/>
		</c:otherwise>
	
	</c:choose>

</body>
</html>