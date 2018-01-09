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
<button type="button" onclick="postUser()">post Data</button>
<div id="demo"></div>
</body>
<script>
var myObj = {"id": 5,"name": "ravi","panNo": "asldkfj"};
$.ajax({
    url: "http://localhost:8080/ins/saveUser",
    type: "POST",
    data: JSON.stringify(myObj),
    contentType: "application/json",
    complete: callback
});

function postUser()
{
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		  if (this.readyState == 4 && this.status == 200) {
			 
		    document.getElementById("demo").innerHTML = this.responseText;
		  }
		};
		xhttp.open("POST", "http://localhost:8080/ins/saveUser", true);
		xhttp.setRequestHeader("Content-type", "application/json");
		var myObj = {"id": 4,"name": "ravi","panNo": "asldkfj"};
		xhttp.send(JSON.stringify(myObj)); 
		
}
</script>
</html>