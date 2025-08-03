<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="bank.BankAccount" %>

<jsp:useBean id="bank" class="bank.BankAccount" scope="request" />
<jsp:setProperty name="bank" property="*" />

<%
    String accountType = request.getParameter("accountType");
    session.setAttribute("accountType", accountType);
%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Bank Account Details</title>
</head>
<body>
    <h2>Bank Account Info (using EL)</h2>

    Account No: ${bank.accountNo} <br/>
    Name: ${bank.name} <br/>
    Balance: ₹${bank.balance} <br/>
    Account Type (Session): ${sessionScope.accountType} <br/><br/>

    <c:choose>
        <c:when test="${bank.balance >= 5000}">
            <b>Status:</b> Sufficient Balance
        </c:when>
        <c:otherwise>
            <b>Status:</b> Low Balance
        </c:otherwise>
    </c:choose>
</body>
</html>
