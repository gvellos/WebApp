package com.example.webapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String name = request.getParameter("name");
     String username = request.getParameter("username");
     String password = request.getParameter("password");

     response.setContentType("text/html"); // Set the response content type as HTML
     PrintWriter out = response.getWriter();
//    out.print("Name: " + name + "<br>");
//    out.print("Username: " + username + "<br>");
//    out.print("Password: " + password + "<br>");
    response.sendRedirect(request.getContextPath() + "/ContentAdmin.jsp");
 }
}
