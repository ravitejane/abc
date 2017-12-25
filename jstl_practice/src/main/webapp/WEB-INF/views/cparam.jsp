<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>
<c:url var="test" value="teja.com">
	<c:param name="name" value="gattineniraviteja"/>
	<c:param name="mobileno" value="9700234001"/>
</c:url>
<c:out value="${test}"></c:out>
</body>
</html>