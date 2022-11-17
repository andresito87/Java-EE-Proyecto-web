<%--
  Created by IntelliJ IDEA.
  User: andres
  Date: 04/11/2022
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario</title>
</head>
<body>
<h3>Formulario</h3>

<form method="post" action="/ServletFormulario">
    <div class="row gtr-uniform">
        <div class="col-6 col-12-xsmall">
            <input type="text" name="demo-name" id="demo-name" value="" placeholder="Name"/>
        </div>
        <div class="col-6 col-12-xsmall">
            <input type="text" name="demo-apellido" id="demo-apellido" value="" placeholder="Apellido"/>
        </div>
        <div class="col-6 col-12-xsmall">
            <input type="email" name="demo-email" id="demo-email" value="" placeholder="Email"/>
        </div>
        <div class="col-6 col-12-xsmall">
            <input type="text" name="demo-asunto" id="demo-asunto" value="" placeholder="Asunto"/>
        </div>
        <div class="col-12">
            <textarea name="demo-message" id="demo-message" placeholder="Enter your message" rows="6"></textarea>
        </div>
        <!-- Break -->
        <%--<div class="col-12">
            <select name="demo-category" id="demo-category">
                <option value="">- Category -</option>
                <option value="1">Manufacturing</option>
                <option value="1">Shipping</option>
                <option value="1">Administration</option>
                <option value="1">Human Resources</option>
            </select>
        </div>
        <!-- Break -->
        <div class="col-4 col-12-small">
            <input type="radio" id="demo-priority-low" name="demo-priority" checked>
            <label for="demo-priority-low">Low</label>
        </div>
        <div class="col-4 col-12-small">
            <input type="radio" id="demo-priority-normal" name="demo-priority">
            <label for="demo-priority-normal">Normal</label>
        </div>
        <div class="col-4 col-12-small">
            <input type="radio" id="demo-priority-high" name="demo-priority">
            <label for="demo-priority-high">High</label>
        </div>
        <!-- Break -->
        <div class="col-6 col-12-small">
            <input type="checkbox" id="demo-copy" name="demo-copy">
            <label for="demo-copy">Email me a copy</label>
        </div>
        <div class="col-6 col-12-small">
            <input type="checkbox" id="demo-human" name="demo-human" checked>
            <label for="demo-human">I am a human</label>
        </div>--%>
        <!-- Break -->

        <!-- Break -->
        <div class="col-12">
            <ul class="actions">
                <li><input type="submit" value="Send Message" class="primary"/></li>
                <li><input type="reset" value="Reset"/></li>
            </ul>
        </div>
    </div>
</form>
<!-- Mostrar si los datos estan cargados en la sesion
Comprobamos si en la sesion existe un atributo nombre que no sea cadena vacía
para mostrar los datos-->
<% if (request.getSession().getAttribute("nombre") != "" && request.getSession().getAttribute("nombre") != null) { %>
    <h3>Datos recogidos correctamente</h3>
    <p>Nombre: <%= request.getSession().getAttribute("nombre") %></p>
    <p>Apellido: <%= request.getSession().getAttribute("apellido") %></p>
    <p>Email: <%= request.getSession().getAttribute("email") %></p>
    <p>Asunto: <%= request.getSession().getAttribute("asunto") %></p>
    <p>Mensaje: <%= request.getSession().getAttribute("mensaje") %></p>
    <h3>Muchas gracias. Pronto nos pondremos en contacto con usted.</h3>
<% } %>
</body>
</html>
