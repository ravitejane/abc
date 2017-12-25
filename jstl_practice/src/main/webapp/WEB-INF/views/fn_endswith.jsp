<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body> 
<c:set var="name" value="${person.name}"/>

<c:if test="${fn:endsWith(name,'teja')}">
	<p>it has end of TEJA</p>
</c:if>

</body>
</html>