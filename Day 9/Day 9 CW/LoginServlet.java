package com.coforge.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("admin") && password.equals("123")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			Cookie cookie = new Cookie("username", username);
			response.addCookie(cookie);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(request, response);
//			response.sendRedirect("loginSuccess.jsp");
		}

		else
			response.sendRedirect("loginFailure.jsp");

		out.close();
	}
}
