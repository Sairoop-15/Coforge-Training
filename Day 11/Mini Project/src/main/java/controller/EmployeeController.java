package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.SQLException;

import exception.InvalidEmployeeObjectException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;
import service.EmployeeService;
import util.ApplicationProperties;

@WebServlet("/EmployeeServlet")
public class EmployeeController extends HttpServlet {

	private EmployeeService service = new EmployeeService();
	String result;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		Employee employee;
		PrintWriter out = response.getWriter();
		result = "";
		try {
			 employee = service.findEmployee(eid);
			 result = employee.getEmpname() + " " + employee.getEmpid() + " " + employee.getDno() + " " + employee.getEmail() + " " + employee.getSalry();
			 out.print(result);
		} 	
		catch (ClassNotFoundException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (SQLException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.validationFailed;
		}
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("emsbutton");
		int eid = 0;
		String ename = "";
		String email = "";
		int salary = 0;
		int deptno = 0;
		String result = "";
		Employee employee = null;

		switch (action) {
		case "Insert":
			eid = Integer.parseInt(request.getParameter("eid"));
			ename = request.getParameter("ename");
			email = request.getParameter("email");
			salary = Integer.parseInt(request.getParameter("salary"));
			deptno = Integer.parseInt(request.getParameter("dno"));
			employee = new Employee(eid, ename, email, salary, deptno);
			try {
				int n = service.createEmployee(employee);
				if(n == 1)
					result = ApplicationProperties.insertSuccess;
			} 
			catch (ClassNotFoundException e) {
				System.out.println(e);
				result = ApplicationProperties.dbFailed;
			} 
			catch (SQLException e) {
				System.out.println(e);
				result = ApplicationProperties.dbFailed;
			} 
			catch (InvalidEmployeeObjectException e) {
				result = ApplicationProperties.validationFailed;
			}
			response.sendRedirect("index.jsp?result=" + result);
			break;
		case "Delete":eid = Integer.parseInt(request.getParameter("eid"));
		try {
			int n = service.deleteEmployee(eid);
			if(n == 1)
				result = ApplicationProperties.deleteSucess;
			else
				result = "Not Found";
		} 
		catch (ClassNotFoundException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (SQLException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.validationFailed;
		}
		response.sendRedirect("index.jsp?result=" + result);
		
			break;
		case "Update":eid = Integer.parseInt(request.getParameter("eid"));
		ename = request.getParameter("ename");
		email = request.getParameter("email");
		salary = Integer.parseInt(request.getParameter("salary"));
		deptno = Integer.parseInt(request.getParameter("dno"));
		employee = new Employee(eid, ename, email, salary, deptno);
		try {
			int n = service.updateEmployee(employee);
			if(n == 1)
				result = ApplicationProperties.updateSuccess;
		} 
		catch (ClassNotFoundException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (SQLException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.validationFailed;
		}
		response.sendRedirect("index.jsp?result=" + result);
		
			break;
		case "Find":eid = Integer.parseInt(request.getParameter("eid"));
		try {
			 result = service.findEmployee(eid).toString();

			response.sendRedirect("index.jsp?result=" +
			        URLEncoder.encode(result, "UTF-8"));
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (SQLException e) {
			System.out.println(e);
			result = ApplicationProperties.dbFailed;
		} 
		catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.validationFailed;
		}
		
			return;
		case "FindAll":
		    try {
		    	StringBuilder sb = new StringBuilder();

		    	for(Employee emp : service.findAllEmployee()){
		    	    sb.append(emp).append("\n\n");
		    	}

		    	result = sb.toString();

		        response.sendRedirect(
		            "index.jsp?result=" +
		            URLEncoder.encode(result, "UTF-8")
		        );
		        return;

		    } catch (ClassNotFoundException e) {
		        result = ApplicationProperties.dbFailed;
		    } catch (SQLException e) {
		        result = ApplicationProperties.dbFailed;
		    } catch (InvalidEmployeeObjectException e) {
		        result = ApplicationProperties.validationFailed;
		    }

		    response.sendRedirect(
		        "index.jsp?result=" +
		        URLEncoder.encode(result, "UTF-8")
		    );
		    return;

		}
	}

}
