package com.coforge.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PasswordStrengthServlets
 */
public class PasswordStrengthServlets extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String password = request.getParameter("pwd");
		
		if( password != null && password.length() <=  3)
			out.println("<font color = 'red'><b>Weak</b></font>");
		if(password != null &&password.length() >  3 && password.length() <= 6)
			out.println("<font color = 'red'><b>Good</b></font>");
		if(password != null && password.length() > 6)
			out.println("<font color = 'red'><b>Strong</b></font>");
		
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
