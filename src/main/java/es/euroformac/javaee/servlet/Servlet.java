package es.euroformac.javaee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.euroformac.javaee.service.NewsService;
import es.euroformac.javaee.service.impl.NewsServiceImpl;

@WebServlet(urlPatterns = "/test")
public class Servlet extends HttpServlet {

    NewsService newsService = new NewsServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(newsService.getNews());
    }
}
