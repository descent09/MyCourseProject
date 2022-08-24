<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <title>Adding new Product</title>
</head>
<body>
    <section>Add new product

    <div>
        <fieldset>
            <form name = "product" action="" method="post">
                Name: <@spring.formInput "form.name" "" "text"/>
                <br>
                Price: <@spring.formInput "form.price" "" "number"/>
                <br>
                Deliver Ability: <@spring.formInput "form.deliverAbility" "" "text"/>
                <br>
                Description: <@spring.formInput "form.description" "" "text"/>

                <br>
                <input type = "submit" value="create">
            </form>
        </fieldset>
    </div>

    </section>

</body>
</html>