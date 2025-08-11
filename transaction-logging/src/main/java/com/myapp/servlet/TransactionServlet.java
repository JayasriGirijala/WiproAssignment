package com.myapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        String amount = req.getParameter("amount");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Transaction of Rs." + amount + " processed successfully.");
    }
}
