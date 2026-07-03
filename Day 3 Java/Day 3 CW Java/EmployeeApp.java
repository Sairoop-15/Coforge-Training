package com.coforge.day3;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee sai = new Employee(101, "sai" ,1028387);
		sai.display();
		
		System.out.println();
		
		Employee Ram = new Employee(102, "Ram" ,1028387);
		Ram.display();
		
		sai.setSalary(68146);
		sai.getSalary();
		
	}
}
