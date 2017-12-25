<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
  
<html>  
<head>  
<title>fmt:parseNumber tag</title>  
</head>  
<body> 
<c:set var="num" value="567.89"></c:set>
<fmt:parseNumber var="i" type="number" value="${num}"/>
${num}<br>
${i}<br>

 <fmt:parseNumber var="j" integerOnly="true" type="number"  value="${num}"/>
${j}

<c:set var="Amount" value="786.970" />  
  
    <fmt:parseNumber var="j" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  
    <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  



</body>
</html>