<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <html> 
    <head>  
    <title>Core Tag Example</title>  
    </head> 
    	<body>  
    	
    	<c:catch var="exp2">
    	<% int a[]=new int[3];
    		int x=a[5];
    	%>
    	</c:catch>
    	
    	<c:if test="${exp2!=null}">
    		<c:out value="${exp2}"/><br>
    		<c:out value="${exp2.message}"/>
    	</c:if>
    	
    	<c:catch var="exp">    	
    	<%	 int a=1/0; %>
    	</c:catch>    	
    	<c:if test="${exp!=null}">
    		<p>type of the exception is :	<c:out value="${exp}"/><br>
    		   name of the exception is :   <c:out value="${exp.message}"/></p>
    	</c:if>
		</body>
	</html>