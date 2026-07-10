package com.coforge.servlet.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class UserInput extends HttpServlet {
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("name");
		String email = request.getParameter("mail");
		
		PrintWriter out = response.getWriter();
		out.println("<font color = 'green'>Username : " + username + "</font>");
		out.println("<font color = 'green'>Email : " + email + "</font>");
	}

}
