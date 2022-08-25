<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Products</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</head>
<body>

<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header
            mdl-layout--fixed-tabs">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <span class="mdl-layout-title">Products</span>
        </div>

        <div class="mdl-layout__tab-bar mdl-js-ripple-effect">
            <a style="text-decoration: none; color: aliceblue" href="http://localhost:8080/ui/UIProduct/v1/products/" class="mdl-layout__tab is-active">Products</a>
            <a style="text-decoration: none; color: aliceblue" href="http://localhost:8080/ui/UICustomer/v1/customers/" class="mdl-layout__tab">Customers</a>
            <a style="text-decoration: none; color: aliceblue" href="http://localhost:8080/ui/UICustom/v1/customs/" class="mdl-layout__tab">Customs</a>
        </div>
    </header>
    <section class="flex">


        <table class="mdl-data-table mdl-js-data-table mdl-shadow--2dp">
            <tr>
                <th>ID</th>
                <th>Product Name</th>
                <th>Price</th>
                <th>Deliver Ability</th>
                <th>Description</th>
                <th>Created at</th>
                <th>Updated at</th>
                <th></th>
                <th></th>
            </tr>
            <tbody>
            <#list products as product>
                <tr>
                    <td class="mdl-data-table__cell">${product.id}</td>
                    <td class="mdl-data-table__cell">${product.name}</td>
                    <td class="mdl-data-table__cell">${product.price}</td>
                    <td class="mdl-data-table__cell">${product.deliverAbility}</td>
                    <td class="mdl-data-table__cell">${product.description}</td>

                    <td class="mdl-data-table__cell"><#if product.createdAt??>${product.createdAt}</#if> </td>
                    <td class="mdl-data-table__cell"><#if product.updatedAt??>${product.updatedAt}</#if> </td>
                    <td class="mdl-data-table__cell"><a href="/ui/UIProduct/v1/products/del/${product.id}">
                            <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent">
                                Delete
                            </button>
                        </a>
                    </td>
                    <td class="mdl-data-table__cell"><a href="/ui/UIProduct/v1/products/edit/${product.id}">
                            <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
                                Edit
                            </button>
                        </a>
                    </td>
                </tr>
            </#list>
            </tbody>

        </table>
        <a href="/ui/UIProduct/v1/products/add">
            <button class="btn btn-primary">Add Product</button>
        </a>
    </section>
</div>

</body>
</html>