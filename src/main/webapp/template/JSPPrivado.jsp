<%--
  Created by IntelliJ IDEA.
  User: andres
  Date: 14/11/2022
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp Privado</title>
</head>
<body>
<!--si no hay usuario en la sesion, redirigimos a la página de registro -->
<% if (session.getAttribute("usuario") == null) {
    response.sendRedirect("registroUsuario.jsp");
} %>
<h1>Jsp Privado</h1>
</body>
</html>
