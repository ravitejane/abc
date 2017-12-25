<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body> 
<h4>with escapeXml</h4>
<c:set var="name" value="raviteja"/>
<c:set var="fullname" value="my name is <xyz>gattineni ravi teja</xyz>"/>
<p>string : 1 - ${fn:escapeXml(name)}</p>
<p>string : 2 - ${fn:escapeXml(fullname)}</p>

<h5>with out escapeXml</h5>

<p>String : 1 - ${name} </p>
<p>String : 2 - ${fullname}</p>

</body>
</html>