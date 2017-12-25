<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
<c:set var="upper" value="HELLO EVERY ONE"></c:set>
<c:set var="lower" value="${person.name }"/>

<p> length : ${fn:length(upper)} </p>
<p>substring : ${fn:substring(lower,5,9)} </p>


</body>
</html>