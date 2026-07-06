package com.coforge.Day5.JDBC;
import java.sql.*;

public class DeleteJDBC {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","sairoop@1551");
		
		PreparedStatement stmt = con.prepareStatement("delete from  tbl_employee where ename = 'Ajay' ");
		System.out.println(stmt.executeUpdate());
		
		stmt.close();
	}
	
}
