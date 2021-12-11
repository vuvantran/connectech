<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    <h1>Product to be updated</h2>
    <form action="/product_update" method="POST">
        <table>
            <tr>
                <td><label>Product ID</label></td>
                <td><input name="id" value="${product.id}" readonly="readonly"/></td>
            </tr>
            <tr>
                <td><label>Name</label></td>
                <td><input name="name" value="${product.name}"/></td>
            </tr>
            <tr>
                <td><label>Price</label></td>
                <td><input name="price" value="${product.price}"/></td>
            </tr>
            <tr>
                <td><label>Remaining Amount</label></td>
                <td><input name="remainingAmount" value="${product.remainingAmount}"/></td>
            </tr>
        </table>
        <input type="submit" value="Submit"/></td>
    </form>
    <a href='/products'>Back to product list</a>
    <a href='/product_detail?id=${product.id}'>View product detail</a>
</body>
</html>