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
            <th>Product</th>
            <th>Customer</th>
            <th>Amount</th>
            <th>Created at</th>
            <th>Updated at</th>
        </tr>
        <tbody>
        <#list customs as custom>
            <tr>
                <td>${custom.id}</td>
                <td>${custom.product.name}</td>
                <td>${custom.customer.customerName}</td>
                <td>${custom.amount}</td>
                <td><#if custom.createdAt??>${custom.createdAt}</#if> </td>
                <td><#if custom.updatedAt??>${custom.updatedAt}</#if> </td>
                <td><a href="/ui/UICustom/v1/customs/del/${custom.id}">Delete</a></td>
            </tr>
        </#list>
        </tbody>
    </table>
    <a href="/ui/UICustom/v1/customs/add">Add Custom</a>
</body>
</html>