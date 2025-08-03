package servletcookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddToCart extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String item = request.getParameter("item");
        if (item != null && !item.isEmpty()) {
            Cookie cookie = new Cookie("item_" + System.currentTimeMillis(), item);
            response.addCookie(cookie);
        }

        out.println("<h3>Item added to cart: " + item + "</h3>");
        out.println("<a href='addItem.html'>Add More Items</a><br>");
        out.println("<a href='ViewCart'>View Cart</a>");
    }
}
