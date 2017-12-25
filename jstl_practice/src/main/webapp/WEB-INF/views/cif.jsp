<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
    <c:set var="a" scope="session" value="${person.id}"/>
  
    <c:if test="${a != 519}">  
   		 <c:out value="${person.id}"/>  
    	<c:out value="${'you are nor ravieja gattineni'}"/>
    </c:if>
    
    <c:if test="${a == 519}">
    	<c:out value="${person.id}"/>
    	<c:out value="${'hello raviteja'}"/>
    </c:if>

</body>
</html>