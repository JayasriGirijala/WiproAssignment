package servletcookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewCart extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();

        out.println("<h2>Your Cart Items:</h2><ul>");
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().startsWith("item_")) {
                    out.println("<li>" + cookie.getValue() + "</li>");
                }
            }
        } else {
            out.println("<li>No items in cart.</li>");
        }
        out.println("</ul><a href='addItem.html'>Back to Shopping</a>");
    }
}
