<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  

<c:set var="name" scope="session" value="${person.name}"/>
<c:if test="${fn:contains(name,'raviteja')}">
	<p>hello raviteja</p>
</c:if>

<c:if test="${fn:containsIgnoreCase(name,'RAVITEJA')}">
	<p>hello Gattineni Ravi Teja</p>
</c:if>

</body>
</html>