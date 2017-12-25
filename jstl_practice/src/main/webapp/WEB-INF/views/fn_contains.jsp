<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>
<c:set var="name" value="hello raviteja "/>
<c:if test="${fn:contains(name,'raviteja')}">
	<p>hello raviteja</p>
</c:if>

<c:if test="${fn:contains(name,'hello')}">
	<c:out value="${'hello raviteja gattineni'}"></c:out>
</c:if>

</body>
</html>