<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
   <style>
      table, td, th {
        border: 1px solid black;
      }

      table {
        border-collapse: collapse;
      }

      th, td {
         padding: 10px;
      }
   </style>
</head>
<body>
    <h1>Product detail</h2>
    <table>
        <tr>
            <td>Product ID</td>
            <td>${product.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${product.name}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${product.price}</td>
        </tr>
        <tr>
            <td>Remaining amount</td>
            <td>${product.remainingAmount}</td>
        </tr>
    </table>
    <a href='/products'>Back to product list</a>
    <a href='/product_update?id=${product.id}'>Edit product</a>
</body>
</html>
