package myservletdemos;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String marks = request.getParameter("marks");

        request.setAttribute("name", name);
        request.setAttribute("marks", marks);

        RequestDispatcher rd = request.getRequestDispatcher("GradeServlet");
        rd.forward(request, response);
    }
}




//http://localhost:8080/WIPROServlets/InputServlet