package com.coforge.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/radiuscalc")
public class RadiusServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int radius = Integer.parseInt(request.getParameter("radius"));

        HttpSession session = request.getSession();
        session.setAttribute("radius", radius);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/radiuscalc2");
        dispatcher.forward(request, response);
    }
}