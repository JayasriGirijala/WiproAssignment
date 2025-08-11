package com.myapp.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {

        String amount = request.getParameter("amount");
        String clientIP = request.getRemoteAddr();

        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("[" + timestamp + "] Transaction Request from IP: " + clientIP + " | Amount: Rs." + amount);

        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
       
    }
}
//Transaction of Rs.500 processed successfully.
//[2025-08-11 00:33:49] Transaction Request from IP: 0:0:0:0:0:0:0:1 | Amount: Rs.500
