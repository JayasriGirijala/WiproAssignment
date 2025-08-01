<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head><title>Vendor List</title></head>
<body>
  <h2>Vendor Records</h2>
  <table border="1">
    <tr><th>ID</th><th>Name</th><th>Email</th></tr>
    <%
      List<String[]> vendors = (List<String[]>) request.getAttribute("vendors");
      if (vendors != null) {
        for (String[] v : vendors) {
    %>
          <tr>
            <td><%= v[0] %></td>
            <td><%= v[1] %></td>
            <td><%= v[2] %></td>
          </tr>
    <%
        }
      }
    %>
  </table>
</body>
</html>
