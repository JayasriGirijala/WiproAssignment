package loginform;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register") // This enables servlet mapping without needing web.xml
public class RegisterServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String profession = request.getParameter("profession");
        String married = request.getParameter("married") != null ? "Yes" : "No";
        String note = request.getParameter("note");

        out.println("<html><body>");
        out.println("<h2>Registration Successful</h2>");
        out.println("<p><strong>Full Name:</strong> " + fullname + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Password:</strong> " + password + "</p>");
        out.println("<p><strong>Date of Birth:</strong> " + dob + "</p>");
        out.println("<p><strong>Gender:</strong> " + gender + "</p>");
        out.println("<p><strong>Profession:</strong> " + profession + "</p>");
        out.println("<p><strong>Married:</strong> " + married + "</p>");
        out.println("<p><strong>Note:</strong> " + note + "</p>");
        out.println("</body></html>");
    }
}
//http://localhost:8080/WIPROServlets/registration.jsp
