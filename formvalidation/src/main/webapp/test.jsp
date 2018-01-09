<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="test" >
		<table>
			<tr>
				<td>Name:</td>
				<td><input name="name" /></td>
				
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="email" /></td>
				
			</tr>
			<tr>
				<td>Age:</td>
				<td><input name="age" /></td>
				
			</tr>
			<tr>
				<td>Gender:</td>
				<td><select name="gender">
						<option value="" label="Select Gender" />
						<option value="MALE" label="Male" />
						<option value="FEMALE" label="Female" />
					</select></td>
			
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><input name="birthday" /></td>
				
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input name="phone" /></td>
				
			</tr> 
			<tr>
				<td colspan="3"><input type="submit" value="Save" /> </td>
			</tr>
		</table>
		</form>
</body>
</html>