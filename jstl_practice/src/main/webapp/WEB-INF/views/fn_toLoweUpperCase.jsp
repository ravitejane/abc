<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
<c:set var="upper" value="HELLO EVERY ONE"></c:set>
<c:set var="lower" value="${person.name }"/>

<p>this is ${fn:toUpperCase(lower)} , ${fn:toLowerCase(upper)}.</p>

</body>
</html>