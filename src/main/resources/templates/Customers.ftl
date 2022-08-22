<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customers</title>
</head>
<body>
    Hello, customers!
    <table border="3">
        <tr>
            <th>ID</th>
            <th>Customer Name</th>
            <th>Address</th>
            <th>Telephone Number</th>
            <th>Customer Name</th>
            <th>Created at</th>
            <th>Updated at</th>
        </tr>
        <tbody>
        <#list customers as customer>
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.address}</td>
                <td>${customer.telephoneNumber}</td>
                <td>${customer.customerName}</td>
                <td>${customer.createdAt}</td>
                <td>${customer.updatedAt}</td>
                <td><a href="/ui/UICustomer/v1/customers/del/${customer.id}">Delete</a></td>
            </tr>
        </#list>
        </tbody>
    </table>
</body>
</html>