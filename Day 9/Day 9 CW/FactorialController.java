package com.coforge.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FactorialController")

public class FactorialController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n = Integer.parseInt(request.getParameter("n"));
		int fact = 1;
		for(int i = 1; i <= n; i++)
			fact *= i;
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("factorialOutput.jsp");
		request.setAttribute("n", n);
		request.setAttribute("fact", fact);
		dispatcher.forward(request, response);
		response.sendRedirect("factorialOutput.jsp?n=" + n + "&fact="+fact);
	}

}
