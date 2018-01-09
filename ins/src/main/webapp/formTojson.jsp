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
<form class="login">
 ID : <input id="empid" type="text" name="id"/><br/><br/>
 NAME : <input id="empname" type="text" name="name"/><br/><br/>
 Pan : <input id="emppan" type="text" name="panNo"/><br/><br/>
		<input class="btnSave" type="submit" value="save"/>
</form>
</body>


<script>
$(document).ready(function(){
	$(".btnSave").click(function(){
		alert("i");
		 /* var formData = $("form.login").serializeObject(); 
		var data = JSON.stringify( $(form).serializeArray() ); */
		var array = jQuery(form).serializeArray();
		alert(array);
		
	});	
});

</script>

</html>