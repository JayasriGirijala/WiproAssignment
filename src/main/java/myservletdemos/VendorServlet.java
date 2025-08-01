package myservletdemos;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class VendorServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<String[]> vendorList = new ArrayList<>();

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro2025", "root", "Jayasri11@");

      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT id, name, email FROM vendor");

      while (rs.next()) {
        vendorList.add(new String[]{
          String.valueOf(rs.getInt("id")),
          rs.getString("name"),
          rs.getString("email")
        });
      }

      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    request.setAttribute("vendors", vendorList);
    RequestDispatcher dispatcher = request.getRequestDispatcher("vendors.jsp");
    dispatcher.forward(request, response);
  }
}
