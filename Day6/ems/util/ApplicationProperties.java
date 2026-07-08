package com.coforge.ems.util;

public class ApplicationProperties {
//	Database Connection Properties
	
	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://127.0.0.1:3306/testdata";
	public static final String userName = "root";
	public static final String password = "sairoop@1551";
	
//	Database SQL Queries
	
	public static final String insertSql = "insert into tbl_employee values (?, ?, ?, ?, ?)";
	public static final String findAllSql = "select * from tbl_employee";
	public static final String deleteEmployeeSql = "delete from tbl-employee where eid = ?";
	public static final String updateEmployeeSql = "update tbl_employee set ename=?, email=?, salary=?, dno=? where eid=?";
	public static final String findEmployeeSql = "select * from tbl_employee where eid = ?";
	
//	Application Response Properties
	
	public static final String insertSuccess = "SUCCESS : Employee Object Created";
	public static final String dbFailed = "FAILED  : DB Error Occoured";
	public static final String deleteSucess = "SUCCESS : Employee Deleted Sucessfully";
	public static final String updateSuccess = "SUCCESS : Employee Updated Sucessfully";
	public static final String employeeNotFound = "FAILED : Employee does not Exist";
	
//	Application Validation Properties
	
	public static final String validationFailed =  "FAILED : Invalid Employee Object or Details";
}
