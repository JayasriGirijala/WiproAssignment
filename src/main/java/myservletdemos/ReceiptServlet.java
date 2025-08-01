package myservletdemos;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/receipt")
public class ReceiptServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product = request.getParameter("product");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = 50.0; // Assume fixed price
        double total = quantity * price;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Product Receipt</h2>");
        out.println("Product: " + product + "<br>");
        out.println("Quantity: " + quantity + "<br>");
        out.println("Price per unit: ₹" + price + "<br>");
        out.println("Total: ₹" + total);
    }
}