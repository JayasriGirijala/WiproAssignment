<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head><title>Balance</title></head>
<body>
  <%
    HttpSession session = request.getSession(false);
    if (session == null || session.getAttribute("accountHolderName") == null) {
      response.sendRedirect("login.jsp");
      return;
    }

    String name = (String) session.getAttribute("accountHolderName");
    double balance = (double) session.getAttribute("accountBalance");
  %>
  <h2>Welcome, <%= name %></h2>
  <p>Your account balance is: $<%= balance %></p>

  <a href="logout">Logout</a>
</body>
</html>
