

$(document).ready(function(){
    var response;
    $.validator.addMethod(
        "uniqueUserName", 
        function(value, element) {
            $.ajax({
                type: "POST",
                url: "http://"+location.host+"/checkUser.php",
                data: "checkUsername="+value,
                dataType:"html",
                success: function(msg)
                {
                    //If username exists, set response to true
                    response = ( msg == 'true' ) ? true : false;
                }
             });
            return response;
        },
        "Username is Already Taken"
    );

    $("#regFormPart1").validate({
        username: {
            required: true,
            minlength: 8,
            uniqueUserName: true
        },
        messages: {
            username: {
                required: "Username is required",
                minlength: "Username must be at least 8 characters",
                uniqueUserName: "This Username is taken already"
            }
        }
    });
});
