<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>
<c:set var="name" scope="session" value="one"></c:set>

	<c:if test="${name == 'one'}">
	<p>one :  </p>	<c:redirect url="http://localhost:8080/SpringMVCHibernate/cparam"></c:redirect>
	</c:if>
	
	<c:if test="${name != one}">
	<p> not one  :  </p>	<c:redirect url="http://localhost:8080/SpringMVCHibernate/cchoose/5289"></c:redirect>
	</c:if>


</body>
</html>