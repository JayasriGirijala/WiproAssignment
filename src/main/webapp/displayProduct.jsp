<%@ page language="java" import="product.ProductBean" %>
<jsp:useBean id="product" class="product.ProductBean" scope="request" />
<jsp:setProperty name="product" property="*" />

<html>
<head><title>Product Details</title></head>
<body>
    <h2>Product Details:</h2>
    Product ID: <jsp:getProperty name="product" property="productId" /><br>
    Name: <jsp:getProperty name="product" property="name" /><br>
    Price: <jsp:getProperty name="product" property="price" /><br>
    Quantity: <jsp:getProperty name="product" property="quantity" /><br>
</body>
</html>
