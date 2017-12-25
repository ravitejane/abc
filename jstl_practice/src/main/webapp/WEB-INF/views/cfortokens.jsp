<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>
<c:forTokens items="ravi-teja-gattineni" delims="-" var="name">
	<c:out value="${name}"></c:out><br>
</c:forTokens>

</body>
</html>