<!-- form.jsp -->
<html>
<head><title>Student Form</title></head>
<body>
    <h2>Enter Student Details</h2>
    <form action="process.jsp" method="post">
        Name: <input type="text" name="studentName" required /><br><br>
        Marks: <input type="number" name="marks" required /><br><br>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
