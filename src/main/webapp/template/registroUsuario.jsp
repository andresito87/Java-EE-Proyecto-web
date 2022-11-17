<%--
  Created by IntelliJ IDEA.
  User: andres
  Date: 14/11/2022
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro de Usuarios</title>
</head>
<body>
<h1>Bienvenido al Sistema de registro de usuarios</h1>
<form action="/ServletRegistro" method="post">
    <table>
        <tr>
            <td>Nombre</td>
            <td><input type="text" name="nombre" value=""></td>
        </tr>
        <tr>
            <td>Apellido</td>
            <td><input type="text" name="apellido" value=""></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value=""></td>
        </tr>
        <tr>
            <td>User</td>
            <td><input type="text" name="user" value=""></td>
        </tr>
        <tr>
            <td>Contraseña</td>
            <td><input type="password" name="password" value=""></td>
        </tr>
        <tr>
            <td><input type="submit" value="Registrar"></td>
        </tr>
    </table>
</form>

</body>
</html>
