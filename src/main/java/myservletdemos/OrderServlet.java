package myservletdemos;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String productName = request.getParameter("productName");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int total = price * quantity;

        out.println("<html><body>");
        out.println("<h2>Order Summary</h2>");
        out.println("Product: " + productName + "<br>");
        out.println("Price: $" + price + "<br>");
        out.println("Quantity: " + quantity + "<br>");
        out.println("<strong>Total: $" + total + "</strong>");
        out.println("</body></html>");
    }
}
