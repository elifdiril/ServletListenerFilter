package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Elif
 */

@WebServlet("/Hello")
public class main extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servlet request");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Servlet Page "+"<h3>Hello World</h3>"+"</h1>");
    }
}