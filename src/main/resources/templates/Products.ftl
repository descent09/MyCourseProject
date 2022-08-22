<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Products</title>
</head>
<body>
    <section>
        Hello, products!
    </section>
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
                    <td><#if product.createdAt??>${product.createdAt}</#if> </td>
                    <td><#if product.updatedAt??>${product.updatedAt}</#if> </td>
                    <td><a href="/ui/UIProduct/v1/products/del/${product.id}">Delete</a></td>
                    <td><a href="/ui/UIProduct/v1/products/edit/${product.id}">Edit</a></td>
                </tr>
            </#list>
        </tbody>

    </table>
    <a href="/ui/UIProduct/v1/products/add">Add Product</a>
</body>
</html>