package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Employee;
import util.ApplicationProperties;
import util.DBUtil;

public class EmployeeDAO {
	public int createEmployee(Employee employee) throws ClassNotFoundException, SQLException{
		int n = 0;
		Connection connection = DBUtil.getDBConnection();
		
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.insertSql);
		statement.setInt(1, employee.getEmpid());
		statement.setString(2,employee.getEmpname());
		statement.setString(3, employee.getEmail());
		statement.setInt(4,employee.getSalry());
		statement.setInt(5, employee.getDno());
		
		n = statement.executeUpdate();
		
		return n;
	}
	
	public int deleteEmployee(int empid) throws ClassNotFoundException, SQLException {
		int n = 0;
		Connection connection = DBUtil.getDBConnection();
		
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.deleteEmployeeSql);
		statement.setInt(1,empid);
		
		n = statement.executeUpdate();
		
		return n;
	}
	
	public int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {

	    int n = 0;

	    Connection connection = DBUtil.getDBConnection();
	    
	    PreparedStatement statement = connection.prepareStatement(ApplicationProperties.updateEmployeeSql);

	    statement.setString(1, employee.getEmpname());
	    statement.setString(2, employee.getEmail());
	    statement.setInt(3, employee.getSalry());
	    statement.setInt(4, employee.getDno());
	    statement.setInt(5, employee.getEmpid());

	    n = statement.executeUpdate();

	    return n;
	}

	public List<Employee> findAllEmployee() throws ClassNotFoundException, SQLException {
		
		List<Employee> employeeList = new ArrayList<>();
		
		Connection connection = DBUtil.getDBConnection();
		
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.findAllSql);
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			Employee employee = new Employee();
			employee.setEmpid(resultSet.getInt("eid"));
			employee.setEmpname(resultSet.getString("ename"));
			employee.setEmail(resultSet.getString("email"));
			employee.setSalry(resultSet.getInt("salary"));
			employee.setDno(resultSet.getInt("dno"));
			
			employeeList.add(employee);
		}
		
		return employeeList;
		
	}

	public Optional<Employee> findEmployee(int id) throws ClassNotFoundException, SQLException {

	    Connection connection = DBUtil.getDBConnection();

	    PreparedStatement statement = connection.prepareStatement(ApplicationProperties.findEmployeeSql);
	    statement.setInt(1, id);

	    ResultSet resultSet = statement.executeQuery();

	    if (resultSet.next()) {
	        Employee employee = new Employee();

	        employee.setEmpid(resultSet.getInt("eid"));
	        employee.setEmpname(resultSet.getString("ename"));
	        employee.setEmail(resultSet.getString("email"));
	        employee.setSalry(resultSet.getInt("salary"));
	        employee.setDno(resultSet.getInt("dno"));

	        return Optional.of(employee);
	    }

	    return Optional.empty();
	}
}
