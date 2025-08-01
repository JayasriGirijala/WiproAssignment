package myservletdemos;


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/add-to-cart")
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item = request.getParameter("item");
        if (item != null && !item.isEmpty()) {
            Cookie cookie = new Cookie("item_" + System.currentTimeMillis(), item);
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);
        }
        response.sendRedirect("add-item.jsp");
    }
}
