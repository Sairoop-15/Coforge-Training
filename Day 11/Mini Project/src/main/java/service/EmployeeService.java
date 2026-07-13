package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import dao.EmployeeDAO;
import exception.InvalidEmployeeObjectException;
import model.Employee;

public class EmployeeService {
	private EmployeeDAO dao = new EmployeeDAO();

	public int createEmployee(Employee employee)
			throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int n = 0;
		if (employee != null && employee.getEmpname() != null && employee.getSalry() > 0) {
			n = dao.createEmployee(employee);
		} else {
			throw new InvalidEmployeeObjectException();
		}
		return n;
	}

	public int deleteEmployee(int empid) throws InvalidEmployeeObjectException, ClassNotFoundException, SQLException {

		int n = 0;

		if (empid > 0) {
			n = dao.deleteEmployee(empid);

			if (n == 0)
				throw new InvalidEmployeeObjectException();
		} else
			throw new InvalidEmployeeObjectException();

		return n;
	}

	public int updateEmployee(Employee employee)
			throws InvalidEmployeeObjectException, ClassNotFoundException, SQLException {

		int n = 0;

		if (employee != null && employee.getEmpid() > 0 && employee.getEmpname() != null && employee.getSalry() > 0) {

			n = dao.updateEmployee(employee);

			if (n == 0)
				throw new InvalidEmployeeObjectException();

		} else
			throw new InvalidEmployeeObjectException();

		return n;
	}

	public List<Employee> findAllEmployee() throws InvalidEmployeeObjectException, ClassNotFoundException, SQLException {
		return dao.findAllEmployee();

	}

	public Employee findEmployee(int id) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		
		Optional<Employee> optionalEmployee  = dao.findEmployee(id);
		
		if (optionalEmployee.isEmpty()) {
			throw new InvalidEmployeeObjectException();
		}
		
		Employee employee = optionalEmployee.get();
		
		return employee;
		
		
	}
}
