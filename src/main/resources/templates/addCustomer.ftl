<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <meta charset="UTF-8">
    <title>Adding new Product</title>
</head>
<body>

    <section>Add new customer

    <div>
        <fieldset>
            <form name = "product" action="" method="post">
                Name: <@spring.formInput "form.name" "" "text"/>
                <br>
                Address: <@spring.formInput "form.address" "" "text"/>
                <br>
                Telephone number: <@spring.formInput "form.telephoneNumber" "" "text"/>
                <br>
                Customer Name: <@spring.formInput "form.customerName" "" "text"/>
                <br>

                <input class="btn btn-primary" type = "submit" value="create">
            </form>
        </fieldset>
    </div>

    </section>

</body>
</html>