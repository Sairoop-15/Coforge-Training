package com.coforge.ems.controller;

import java.sql.SQLException;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;
import com.coforge.ems.util.ApplicationProperties;

public class EmployeeController {
	private EmployeeService service = new EmployeeService();

	public String createEmployee(Employee employee) {
		String result = "";
		try {
			int n = service.createEmployee(employee);
			if (n == 1)
				result = ApplicationProperties.insertSuccess;
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
			result = ApplicationProperties.dbFailed;
		}

		catch (SQLException e) {
			e.printStackTrace();
			result = ApplicationProperties.dbFailed;
		}

		catch (InvalidEmployeeObjectException e) {
			e.printStackTrace();
			result = e.toString();
		}

		return result;
	}

	public String deleteEmployee(int empid) {
		String result = "";
		int n;
		try {
			n = service.deleteEmployee(empid);
			if (n == 1)
				result = ApplicationProperties.dbFailed;
		}

		catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		}

		catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.dbFailed;
		}

		catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		}

		return result;
	}

	public String updateEmployee(Employee emp) {

		String result = "";

		try {

			int n = service.updateEmployee(emp);

			if (n == 1)
				result = ApplicationProperties.updateSuccess;

		}

		catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		}

		catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		}

		catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}

		return result;
	}

	public String findAllEmployee() {
		String result = "";
		try {
			result = service.findAllEmployee().toString();
		}

		catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		}

		catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}

		catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		}

		return result;
	}

	public String findEmployee(int id) {
		String result = "";
		try {
			result = service.findEmployee(id);
		
		} 
		
		catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} 
		
		catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} 
		
		catch (InvalidEmployeeObjectException e) {
			result = ApplicationProperties.employeeNotFound;
		}
		
		return result;
	}
}
