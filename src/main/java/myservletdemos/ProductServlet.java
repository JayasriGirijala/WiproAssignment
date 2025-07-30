package myservletdemos;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String productData = request.getParameter("product");
        if (productData == null || !productData.contains(",")) {
            out.println("<html><body>");
            out.println("<h3>Error: Invalid product selection.</h3>");
            out.println("<a href='product.html'>Go back</a>");
            out.println("</body></html>");
            return;
        }

        String[] parts = productData.split(",");
        String productName = parts[0];
        String price = parts[1];

        out.println("<html><body>");
        out.println("<h2>Enter Quantity for " + productName + "</h2>");
        out.println("<form action='OrderServlet' method='post'>");
        out.println("Quantity: <input type='number' name='quantity' required min='1'><br>");
        out.println("<input type='hidden' name='productName' value='" + productName + "'>");
        out.println("<input type='hidden' name='price' value='" + price + "'>");
        out.println("<input type='submit' value='Buy'>");
        out.println("</form>");
        out.println("</body></html>");
    }
}
