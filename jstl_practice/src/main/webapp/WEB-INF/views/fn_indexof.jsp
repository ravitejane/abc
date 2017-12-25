<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body> 
<h4>with escapeXml</h4>
<c:set var="name" value="it is raviteja"/>
<c:set var="fullname" value="my name is <xyz>gattineni ravi teja</xyz>"/>

<p>Index of -1 : ${fn:indexOf(name,'raviteja')} </p>
<p>Index of -2 : ${fn:indexOf(fullname,'gattineni')} </p>
</body>
</html>