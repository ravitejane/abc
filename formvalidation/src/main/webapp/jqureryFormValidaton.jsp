<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="jquery-3.2.1.min.js"></script>
<script src="jquery.validate.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="test" name="testform">
		<table>
			<tr>
				<td>Name:</td>
				<td><input name="name" id="name" /></td>
				
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="email" id="email" /></td>
				
			</tr>
			<tr>
				<td>Age:</td>
				<td><input name="age" id="age" /></td>
				
			</tr>
			<tr>
				<td>Gender:</td>
				<td><select name="gender" id="gender">
						<option value="" label="Select Gender" />
						<option value="MALE" label="Male" />
						<option value="FEMALE" label="Female" />
					</select></td>
			
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><input name="birthday" id="birthday" /></td>
				
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input name="phoneno" id="phoneno" /></td>
				
			</tr> 
			<tr>
				<td colspan="3"><input type="submit" id="form1" value="Save" /> </td>
			</tr>
		</table>
		</form>

</body>
<script>
$(document).ready(function(){

	$("form[name='testform']").validate({
		rules: {
		       name: "required",		   
		      email: {
		        required: true,		        
		        email: true
		      },
		     age: {
		        required: true,
		        minlength: 2
		      }
		    },
		   
		    messages: {
		     
		     name: "Please enter your lastname",
		      age: {
		        required: "Please provide a password",
		        minlength: "Your password must be at least 5 characters long"
		      },
		      email: "Please enter a valid email address"
		    },
		    // Make sure the form is submitted to the destination defined
		    // in the "action" attribute of the form when valid
		    submitHandler: function(form) {
		      form.submit();
		    }
		
	});
});

</script>
</html>