package es.euroformac.javaee.servlet;

import es.euroformac.javaee.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletRegistro", value = "/ServletRegistro")
public class ServletRegistro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        //crear un objeto usuario y añadir toda la informacion
        Usuario usuario = new Usuario(nombre, apellido, email, user, password);


        //cargar datos en la sesion
        HttpSession session = request.getSession();
        session.setAttribute("usuario", usuario);
        if (usuario.getNombre() != null && usuario.getNombre().length() > 0) {
            response.sendRedirect("/template/JSPPrivado.jsp");
        } else {
            response.sendRedirect("/template/registroUsuario.jsp");
        }

    }
}
