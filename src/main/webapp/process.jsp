<!-- process.jsp -->
<%
    String studentName = request.getParameter("studentName");
    String marksStr = request.getParameter("marks");

    int marks = 0;

    if (marksStr != null && !marksStr.trim().isEmpty()) {
        try {
            marks = Integer.parseInt(marksStr.trim());
        } catch (NumberFormatException e) {
            out.println("<h3>Invalid marks entered. Please enter a valid number.</h3>");
            return;
        }
    } else {
        out.println("<h3>Marks not provided. Please enter marks.</h3>");
        return;
    }

    request.setAttribute("studentName", studentName);
    request.setAttribute("marks", marks);

    if (marks >= 40) {
        RequestDispatcher rd = request.getRequestDispatcher("pass.jsp");
        rd.forward(request, response);
    } else {
        RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
        rd.forward(request, response);
    }
%>
