<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body> 
<c:forEach var="i" begin="1" end="5">
	<c:out value="${i}"/>
	<br>
</c:forEach>

<c:forEach var="person" items="${persons}">
<c:out value="${person.id}"/>  :  <c:out value="${person.name}"/>   :    <c:out value="${person.country}"/><br>
</c:forEach>
</body>
</html>