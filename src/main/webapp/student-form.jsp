<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Student Form</title></head>
<body>
    <h2><c:if test="${student != null}">Edit</c:if><c:if test="${student == null}">Add</c:if> Student</h2>
    <form action="StudentServlet" method="post">
        <input type="hidden" name="action" value="${student != null ? 'update' : 'insert'}"/>
        <c:if test="${student != null}">
            <input type="hidden" name="id" value="${student.id}"/>
        </c:if>
        Name: <input type="text" name="name" value="${student.name}" required/><br/>
        Email: <input type="text" name="email" value="${student.email}" required/><br/>
        Course: <input type="text" name="course" value="${student.course}" required/><br/>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>
