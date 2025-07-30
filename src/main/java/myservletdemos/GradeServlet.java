package myservletdemos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GradeServlet")
public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = (String) request.getAttribute("name");
        String marksStr = (String) request.getAttribute("marks");

        int marks = 0;
        try {
            marks = Integer.parseInt(marksStr);
        } catch (NumberFormatException e) {
            out.println("<h3>Invalid marks entered.</h3>");
            return;
        }

        String grade;
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B";
        else if (marks >= 60) grade = "C";
        else if (marks >= 50) grade = "D";
        else grade = "F";

        out.println("<html><body>");
        out.println("<h2>Grade Result</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Marks: " + marks + "</p>");
        out.println("<p>Grade: <b>" + grade + "</b></p>");
        out.println("</body></html>");
    }
}

