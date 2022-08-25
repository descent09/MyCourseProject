<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <meta charset="UTF-8">
    <title>Updating new Product</title>
</head>
<body>

    <section>Update product

    <div>
        <fieldset>
            <form name = "product" action="" method="post">
                ID: <@spring.formInput "form.id" "" "text"/>
                <br>
                Name: <@spring.formInput "form.name" "" "text"/>
                <br>
                Price: <@spring.formInput "form.price" "" "number"/>
                <br>
                Deliver Ability: <@spring.formInput "form.deliverAbility" "" "text"/>
                <br>
                Description: <@spring.formInput "form.description" "" "text"/>
                <br>
                CreatedAt: <@spring.formInput "form.createdAt" "" "date"/>
                <br>
                UpdatedAt: <@spring.formInput "form.updatedAt" "" "date"/>
                <br>
                <input class="btn btn-primary" type = "submit" value="Submit">
                <a href="http://localhost:8080/ui/UIProduct/v1/products/">
                    <button type="button" class="btn btn-secondary">Cancel</button>
                </a>
            </form>
        </fieldset>
    </div>

    </section>

</body>
</html>