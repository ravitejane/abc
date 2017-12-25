    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <html>  
    <head>  
    <title>Core Tag Example</title>  
    </head>  
    <body>  
    <c:set var="id" scope="session" value="${person.id}"/>
    <c:set var="name" scope="request" value="${person.name}"/>
    <c:set var="country" scope="session" value="${person.country}"/>
    <c:out value="${id}"/>
    <br>
    <c:out value="${name}"/>
    <br>
    <c:out value="${country}"/>
    <br>
    <c:remove var="id"/>
    <br>
 	<p> after remove id :  <c:out value="${id}"/></p>
 	<br>
 	<c:remove var="name"/>
 	<p> after remove name : <c:out value="${name}"/></p>
 	<br>
 	<c:remove var="country"/>
 	<p>after remove country: 	<c:out value="${country}"/> </p>
 	<c:set var="myname" scope="session" value="${'raviteja gattineni'}"/>
 	<br>
 	<p> My name is : <c:out value="${myname}"/></p>
    </body>  
    </html>  