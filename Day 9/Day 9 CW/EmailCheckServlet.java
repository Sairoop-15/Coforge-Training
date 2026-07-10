package com.coforge.servlet.ajax;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailCheckServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String email = request.getParameter("mailId");

        if (email != null && email.equals("sai@gmail.com")) {
            out.println("<font color='green'>Valid Email</font>");
        } 
        
        else {
            out.println("<font color='red'>Invalid Email</font>");
        }
    }
}