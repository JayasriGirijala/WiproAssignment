<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>
    <h2>Add Book</h2>
    <form action="books" method="post">
        Title: <input type="text" name="title" required><br><br>
        Author: <input type="text" name="author" required><br><br>
        Price: <input type="number" name="price" step="0.01" required><br><br>
        <input type="submit" value="Add Book">
    </form>
    <br>
    <a href="books?action=list">View All Books</a>
</body>
</html>
