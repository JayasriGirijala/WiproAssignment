<%@ page language="java" %>
<%
  String accNo = request.getParameter("accountNumber");
  String password = request.getParameter("password");

  if ("123456".equals(accNo) && "pass123".equals(password)) {
    session.setAttribute("name", "John Doe");
    session.setAttribute("balance", 15000.75);
    response.sendRedirect("balance.jsp");
  } else {
%>
    <h3>Invalid account number or password</h3>
    <a href="login.jsp">Try again</a>
<%
  }
%>
