<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
<c:set var="upper" value="HELLO EVERY ONE"></c:set>

<P> before : ${fn:substringBefore(upper,'EVERY')} </P>
<p> after : ${fn:substringAfter(upper,'EVERY') } </p>

</body>
</html>