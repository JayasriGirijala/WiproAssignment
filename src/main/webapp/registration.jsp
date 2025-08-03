<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        h2 {
            text-align: center;
        }

        .form-container {
            margin: 0 auto;
            width: 50%;
            padding: 20px;
        }

        table {
            width: 100%;
            border-spacing: 10px; /* Replaces cellpadding */
        }

        td {
            vertical-align: top;
        }

        .submit-row {
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>User Registration</h2>
    <div class="form-container">
        <form method="post" action="register">
            <table>
                <tr>
                    <td>Full name:</td>
                    <td><input type="text" name="fullname" required /></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><input type="email" name="email" required /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" required /></td>
                </tr>
                <tr>
                    <td>Birthday (yyyy-mm-dd):</td>
                    <td><input type="date" name="dob" required /></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td>
                        <input type="radio" name="gender" value="Male" required /> Male
                        <input type="radio" name="gender" value="Female" required /> Female
                    </td>
                </tr>
                <tr>
                    <td>Profession:</td>
                    <td>
                        <select name="profession">
                            <option>Developer</option>
                            <option>Tester</option>
                            <option>Manager</option>
                            <option>Other</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Married?</td>
                    <td><input type="checkbox" name="married" value="yes" /></td>
                </tr>
                <tr>
                    <td>Note:</td>
                    <td><textarea name="note" rows="4" cols="25"></textarea></td>
                </tr>
                <tr>
                    <td colspan="2" class="submit-row">
                        <input type="submit" value="Register" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
