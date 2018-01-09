<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <script src="jquery-3.2.1.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <form>
<input id="empid" type="text" name="id"/>
<button id="buttonload">click to load</button>
</form> -->
<button id="buttonload">click to load</button>
<table class="data-contacts-js" >
        <tr>
            <th>EmpId</th>
            <th>Name</th>
            <th>Pan</th>
        </tr>
    </table>
</body>
<script>
$(document).ready(function(){
	$("button").click(function(){
		/* var abc=$("#empid").val();
		var url="http://localhost:8080/ins/user/"+abc; */
	    $.get("http://localhost:8080/ins/users", function(data, status){
	    	
	    	$.each(data, function(i, contact) {

                $(".data-contacts-js").append(
                    "<tr><td>" + contact.id + "</td>" +
                    "<td>" + contact.name + "</td>" +
                    "<td>" + contact.panNo + "</td></tr>");
            });
	    });
	});
	
});

</script>
</html>