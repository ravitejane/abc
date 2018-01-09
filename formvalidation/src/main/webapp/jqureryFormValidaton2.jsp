<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.userform{width: 400px;}
.userform p {
    width: 100%;
}
.userform label {
    width: 120px;
    color: #333;
    float: left;
}
input.error {
    border: 1px dotted red;
}
label.error{
    width: 100%;
    color: red;
    font-style: italic;
    margin-left: 120px;
    margin-bottom: 5px;
}
.userform input.submit {
    margin-left: 120px;
}
</style>
</head>
<body>
<form class="userform" id="userForm" method="post" action="test2">
    <p>
        <label for="name">Name</label>
        <input id="name" name="name" type="text" >
    </p>
    <p>
        <label for="email">E-Mail</label>
        <input id="email" type="text" name="email" >
    </p>
    <p>
        <label for="phone">Phone</label>
        <input id="phone" type="text" name="phone" >
    </p>
    <p>
        <label for="url">URL</label>
        <input id="url" type="text" name="url">
    </p>
    <p>
        <label for="username">User name</label>
        <input id="username" name="username" type="text">
    </p>
    <p>
        <label for="password">Password</label>
        <input id="password" name="password" type="password">
    </p>
    <p>
        <label for="confirm_password">Confirm password</label>
        <input id="confirm_password" name="confirm_password" type="password">
    </p>
    <p>
        <label for="agree">Please agree to our policy</label>
        <input type="checkbox" class="checkbox" id="agree" name="agree">
    </p>
    <p>
        <input class="submit" type="submit" value="Submit">
    </p>
</form>

</body>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->
<!-- <script src="jquery-3.2.1.js"></script> -->
<script src="jquery.validate1.js"></script> 

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.js"></script>
<script src="http://ajax.microsoft.com/ajax/jquery.validate/1.11.1/additional-methods.js"></script>
<script>
$(document).ready(function() {
	
    $("#userForm").validate({
        rules: {
            name: "required",
            email: {
                required: true,
                email: true
            },
            phone: {
                required: true,
                number: true
            },
            url: {
                required: false,
                url: true
            },
            username: {
                required: true,
                minlength: 6
            },
            password: {
                required: true,
                minlength: 6
            },
            confirm_password: {
                required: true,
                minlength: 6,
                equalTo: "#password"
            },
            agree: "required"
        },
        messages: {
            name: "Please enter your name",
            email: "Please enter a valid email address",
            phone: {
                required: "Please enter your phone number",
                number: "Please enter only numeric value"
            },
            url: {
                url: "Please enter valid url"
            },
            username: {
                required: "Please enter a username",
                minlength: "Your username must consist of at least 6 characters"
            },
            password: {
                required: "Please provide a password",
                minlength: "Your password must be at least 6 characters long"
            },
            confirm_password: {
                required: "Please provide a password",
                minlength: "Your password must be at least 6 characters long",
                equalTo: "Please enter the same password as above"
            },
            agree: "Please accept our policy"
        },
        ignore:      "",
        errorClass:  'fieldError',
        onkeyup:     false,
        onblur:      false,
        errorElement:'label',
        submitHandler: function (form) {
            alert('is good');
            return false;
        }
    });
});
</script>
</html>