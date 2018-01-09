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
<div id="demo"></div><br/><br/><br/>
<button class="button1">clicktoload</button>
<table class="data-contacts-js" id="tableone" >
        <tr>
            <th>EmpId</th>
            <th>Name</th>
            <th>Pan</th>
        </tr>
    </table>
<form>
Enter the number : <input id="name" type="text" name="name"/>
<input type="submit" value="getUser" onclick="getUser()"> 
</form>
<button type="button" onclick="getUsers()">click to fire</button>
<script>
var res;
function getUsers()
{
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		  if (this.readyState == 4 && this.status == 200) {
			  res=JSON.parse(this.responseText);
		    document.getElementById("demo").innerHTML = this.responseText;
		  }
		};
		xhttp.open("GET", "http://localhost:8080/ins/users", true);
		xhttp.send(); 
}
function getUser()
{
	var user=document.getElementById("name").value;
	var url="http://localhost:8080/ins/user/"+user;
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		  if (this.readyState == 4 && this.status == 200) {
			  res=JSON.parse(this.responseText);
			    writeUser(JSON.parse(this.responseText));
			    
		    document.getElementById("demo").innerHTML = this.responseText;
		  }
		};
		xhttp.open("GET", url, true);
		xhttp.send(); 
}

function writeUser(user1)
{
	alert(user1.id+" "+user1.name+" "+user1.panNo);
	var table = document.getElementById("tableone");
    var row = table.insertRow(0);
    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    var cell23 = row.insertCell(2);
    cell1.innerHTML = user1.id;
    cell2.innerHTML = user1.name;
    cell3.innerHTML = user1.panNo;
}
$(document).ready(function(){
	
	$(".button1").click(function(){
		alert(res);
	 $.each(res, function(i, contact) {

        $(".data-contacts-js").append(
            "<tr><td>" + contact.id + "</td>" +
            "<td>" + contact.name + "</td>" +
            "<td>" + contact.panNo + "</td></tr>");
    });	 
	 });
});

</script>
</body>
</html>