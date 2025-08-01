package myservletdemos;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class ViewCartServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    List<String> items = new ArrayList<>();

    if (cookies != null) {
      for (Cookie c : cookies) {
        if (c.getName().startsWith("item_")) {
          items.add(c.getValue());
        }
      }
    }

    request.setAttribute("cartItems", items);
    RequestDispatcher dispatcher = request.getRequestDispatcher("view-cart.jsp");
    dispatcher.forward(request, response);
  }
}
