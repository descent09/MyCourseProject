<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <meta charset="UTF-8">
    <title>Adding new Custom</title>
</head>
<body>

<section>Add new custom

    <div>
        <fieldset>
            <form name = "custom" action="" method="post">
                Product: <@spring.formSingleSelect "form.product", products, ""/>
                <br>
                Customer Name: <@spring.formSingleSelect "form.customer", names, ""/>
                <br>
                Amount: <@spring.formInput  "form.amount" "" "number"/>
                <br>
                <input class="btn btn-primary" type = "submit" value="create">
            </form>
        </fieldset>
    </div>

</section>


</body>
</html>