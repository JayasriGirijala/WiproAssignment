<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
    <h2>List of Books</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th><th>Title</th><th>Author</th><th>Price</th>
        </tr>
        <c:forEach var="book" items="${bookList}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="books">Add New Book</a>
</body>
</html>
