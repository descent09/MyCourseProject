<!DOCTYPE html>
<html lang="en">
<head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    <script src="https://cdn.tailwindcss.com"></script>
    <meta charset="UTF-8">
    <title>Customs</title>

</head>
<body>
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header
            mdl-layout--fixed-tabs">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <span class="mdl-layout-title">Customs</span>
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
                <th>Product</th>
                <th>Customer</th>
                <th>Amount</th>
                <th>Created at</th>
                <th>Updated at</th>
                <th></th>
                <th></th>
            </tr>
            <tbody>
            <#list customs as custom>
                <tr>
                    <td class="mdl-data-table__cell" >${custom.id}</td>
                    <td class="mdl-data-table__cell" >${custom.product.name}</td>
                    <td class="mdl-data-table__cell" >${custom.customer.customerName}</td>
                    <td class="mdl-data-table__cell">${custom.amount}</td>
                    <td class="mdl-data-table__cell"><#if custom.createdAt??>${custom.createdAt}</#if> </td>
                    <td class="mdl-data-table__cell"><#if custom.updatedAt??>${custom.updatedAt}</#if> </td>
                    <td class="mdl-data-table__cell">
                        <a href="/ui/UICustom/v1/customs/del/${custom.id}">
                            <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent">Delete</button>
                        </a>
                    </td>
                    <td class="mdl-data-table__cell">
                        <a href="/ui/UICustom/v1/customs/edit/${custom.id}">
                            <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
                                Edit
                            </button>
                        </a>
                    </td>
                </tr>
            </#list>
            </tbody>
        </table>
        <a class="flex-initial" href="/ui/UICustom/v1/customs/add">
            <button class="btn btn-primary">Add Custom</button>
        </a>
    </section>
</div>


</body>
</html>