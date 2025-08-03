<!-- pass.jsp -->
<html>
<head><title>Pass Result</title></head>
<body>
    <h2>Congratulations <%= request.getAttribute("studentName") %>!</h2>
    <p>You passed with <%= request.getAttribute("marks") %> marks.</p>

    <jsp:include page="footer.jsp" />
</body>
</html>
