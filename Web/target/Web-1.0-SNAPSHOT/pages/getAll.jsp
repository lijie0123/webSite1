<%--
  Created by IntelliJ IDEA.
  User: lj
  Date: 16-3-6
  Time: 上午4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>all</title>
</head>
<body>
<p>
    ${result}
</p>
<br/>
<form action="/savePerson" method="post">
    <table>
        <tr>
            <label id="idR">
                <td><p>Id:</p></td>
                <td><input name="id" type="text"></td>
            </label>
        </tr>
        <tr>
            <label id="nameR">
                <td><p>name:</p></td>
                <td><input name="name" type="text"></td>
            </label>
        </tr>
        <tr>
            <label id="sexR">
                <td><p>sex:</p></td>
                <td><input name="sex" type="text"></td>
            </label>
        </tr>
        <tr>
            <label id="ageR">
                <td><p>age:</p></td>
                <td><input name="age" type="text"></td>
            </label>
        </tr>
        <tr>
            <label id="descR">
                <td><p>desc:</p></td>
                <td><input name="desc" type="text"></td>
            </label>
        </tr>

    </table>
    <input type="submit" content="submit">
</form>

</body>
</html>
