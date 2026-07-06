package com.coforge.Day5.JDBC;

import java.sql.*;

public class SelectJDBC {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","sairoop@1551");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from tbl_employee");
		
		while(rs.next()) {
			String s1 = rs.getString(1);
			String s2 = rs.getString(2);
			String s3 = rs.getString(3);
			String s4 = rs.getString(4);
			String s5 = rs.getString(5);
			System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5);
			
		}
		
		stmt.close();
		rs.close();
	}
}
