package com.example.webapplication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletLogin", value = "/ServletLogin")
public class ServletLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String destination = "index.jsp";
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
//        response.setContentType("index/jsp");


        String logedinpage = "/signup.jsp";
        response.sendRedirect("");


//
//        String name = request.getParameter("name").toString(); // Get the form parameter values
//        String username = request.getParameter("username").toString();
//        String password = request.getParameter("password").toString();
//
//
//
//        PrintWriter out = response.getWriter();
//        out.print("Name: " + name + "<br>");
//        out.print("Username: " + username + "<br>");
//        out.print("Password: " + password + "<br>");

    }
//    public void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        doGet(request, response);
//        response.sendRedirect(request.getContextPath() + "/index.jsp");
//    }

}