package es.euroformac.javaee.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletFormulario", value = "/ServletFormulario")
public class ServletFormulario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("demo-name");
        String apellido = request.getParameter("demo-apellido");
        String asunto = request.getParameter("demo-asunto");
        String email = request.getParameter("demo-email");
        String mensaje = request.getParameter("demo-message");



        //cargar datos en la sesion
        HttpSession session = request.getSession();
        session.setAttribute("nombre", nombre);
        session.setAttribute("apellido", apellido);
        session.setAttribute("asunto", asunto);
        session.setAttribute("email", email);
        session.setAttribute("mensaje", mensaje);
        response.sendRedirect("/template/formulario.jsp");
    }
}
