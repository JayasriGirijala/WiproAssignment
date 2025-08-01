<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head><title>View Cart</title></head>
<body>
  <h2>Your Cart Items:</h2>
  <ul>
    <%
      List<String> items = (List<String>) request.getAttribute("cartItems");
      if (items != null && !items.isEmpty()) {
        for (String item : items) {
    %>
          <li><%= item %></li>
    <%
        }
      } else {
    %>
      <p>Your cart is empty.</p>
    <%
      }
    %>
  </ul>
  <a href="add-item.jsp">Back to Add Item</a>
</body>
</html>
