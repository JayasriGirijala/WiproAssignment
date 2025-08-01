<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Login</title></head>
<body>
  <h2>Login</h2>
  <form method="post" action="login">
    Account Number: <input type="text" name="accountNumber" required /><br>
    Password: <input type="password" name="password" required /><br>
    <button type="submit">Login</button>
  </form>
  <p style="color:red;">
    <%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %>
  </p>
</body>
</html>
