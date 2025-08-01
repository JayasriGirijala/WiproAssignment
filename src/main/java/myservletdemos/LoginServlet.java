package myservletdemos;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String accountNumber = request.getParameter("accountNumber");
    String password = request.getParameter("password");

    // Dummy validation - replace with real DB validation
    if ("12345".equals(accountNumber) && "pass123".equals(password)) {
      HttpSession session = request.getSession();
      session.setAttribute("accountHolderName", "John Doe");
      session.setAttribute("accountBalance", 1000.50);

      response.sendRedirect("balance");
    } else {
      request.setAttribute("error", "Invalid account number or password");
      RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
      rd.forward(request, response);
    }
  }
}
