<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Level Up Lunch - Contact Listing</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"></head>
<body>

    <h2>Contact Listing</h2>

    <table class="data-contacts-js table table-striped" >
        <tr>
            <th>EmpId</th>
            <th>Name</th>
            <th>Pan</th>
        </tr>
    </table>

    <button id="fetchContacts" class="btn btn-default" type="submit">Button</button>

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script type="text/javascript">

        $("#fetchContacts").bind("click", function() {

            $.get("http://localhost:8080/ins/users", function(data) {

                $.each(data, function(i, contact) {

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