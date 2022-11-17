<%
    String nombre = (String) session.getAttribute("nombre");
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Respuesta</title>
</head>
<body>
<br>
<h2 style="color: green">Muchas Gracias, <%=nombre%>!</h2>
<br>
<h3 style="color: green">Has completado el formulario correctamente. En breve nos pondremos en contacto contigo.</h3>
</body>
</html>
