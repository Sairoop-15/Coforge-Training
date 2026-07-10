package com.coforge.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/radiuscalc2")
public class RadiusCalc extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        int radius = (Integer) session.getAttribute("radius");

        double area = Math.PI * radius * radius;

        PrintWriter out = response.getWriter();

        out.println("<h2>Radius : " + radius + "</h2>");
        out.println("<h2>Area of Circle : " + area + "</h2>");
    }
}