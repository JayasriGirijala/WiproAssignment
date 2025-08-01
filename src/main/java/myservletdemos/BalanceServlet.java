package myservletdemos;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class BalanceServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession(false); // don't create new

    if (session != null && session.getAttribute("accountHolderName") != null) {
      RequestDispatcher rd = request.getRequestDispatcher("balance.jsp");
      rd.forward(request, response);
    } else {
      response.sendRedirect("login.jsp");
    }
  }
}
