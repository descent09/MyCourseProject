<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>

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
                Amount: <@spring.formInput "form.amount" "" "number"/>
                <br>
                <input type = "submit" value="create">
            </form>
        </fieldset>
    </div>

</section>

</body>
</html>