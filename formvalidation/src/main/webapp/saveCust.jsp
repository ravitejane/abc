<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="POST" action="saveCustomer" modelAttribute="customer">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
				
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" /></td>
				
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:select path="gender">
						<form:option value="" label="Select Gender" />
						<form:option value="MALE" label="Male" />
						<form:option value="FEMALE" label="Female" />
					</form:select></td>
			
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><form:input path="birthday" /></td>
				
			</tr>
			<tr>
				<td>Phone:</td>
				<td><form:input path="phoneno" /></td>
				
			</tr>
			<tr>
				<td colspan="3"><form:input type="submit" value="Save" path="" /> </td>
			</tr>
		</table></form:form>
</body>
</html>