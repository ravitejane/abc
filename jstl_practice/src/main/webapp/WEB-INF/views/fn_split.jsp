<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
<c:set var="name" value="hello-ravi-teja-gattineni"></c:set>
<c:set var="str" value="${fn:split(name,'-')}"/>

<c:forEach items="${str}" var="one">
${one}<br>
</c:forEach>

<c:set var="str2" value="${fn:join(str,'*')}"/>
${str2}<br>

<c:set var="data" value="${person.name}"/>

<c:set var="data2" value="${fn:split(data,' ')}"/>

<c:forEach var="i" items="${data2}">
${i}<br>
</c:forEach>
</body>
</html>