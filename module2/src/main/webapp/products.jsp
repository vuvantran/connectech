<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
   <style>
      table, td, th {
      border: 1px solid black;
      }

      table {
      width: 100%;
      border-collapse: collapse;
      }
   </style>
</head>
<body>
<h2>Products list</h2>

<table>
   <tr>
      <th>Product ID</td>
      <th>Name</td>
      <th>Price</td>
   </tr>
   <c:forEach items="${products}" var="product">
   <tr>
      <td><a href='/product_detail?id=${product.id}'>${product.id}</a></td>
      <td>${product.name}</td>
      <td>${product.price}</td>
   </tr>
   </c:forEach>
</table>
</body>
</html>
