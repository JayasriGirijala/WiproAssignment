<!-- fail.jsp -->
<html>
<head><title>Fail Result</title></head>
<body>
    <h2>Sorry <%= request.getAttribute("studentName") %>!</h2>
    <p>You failed with <%= request.getAttribute("marks") %> marks.</p>

    <jsp:include page="footer.jsp" />
</body>
</html>
