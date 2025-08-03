package servletcookie;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VendorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wipro2025", "root", "Jayasri11@");

            Statement stmt = conn.createStatement();  // ✅ Fixed line
            ResultSet rs = stmt.executeQuery("SELECT * FROM vendor");

            out.println("<h2>Vendor List</h2>");
            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Company</th></tr>");
            while (rs.next()) {
                out.println("<tr><td>" + rs.getInt("id") + "</td><td>" +
                            rs.getString("name") + "</td><td>" +
                            rs.getString("company") + "</td></tr>");
            }
            out.println("</table>");

            conn.close();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
}
