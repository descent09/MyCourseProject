<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customs</title>
</head>
<body>
    Hello, customs!
    <table border="3">
        <tr>
            <th>ID</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Deliver Ability</th>
            <th>Description</th>
            <th>Created at</th>
            <th>Updated at</th>
        </tr>
        <tbody>
        <#list products as product>
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.deliverAbility}</td>
                <td>${product.description}</td>
                <td>${product.createdAt}</td>
                <td>${product.updatedAt}</td>
                <td><a href="/ui/UIProduct/v1/products/del/${product.id}">Delete</a></td>
            </tr>
        </#list>
        </tbody>
    </table>
</body>
</html>