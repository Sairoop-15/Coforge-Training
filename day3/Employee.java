package com.coforge.day3;

// Java Bean or POJO or Modal Class
public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	
	public void display () {
		System.out.println("Employee id : " + eid);
		System.out.println("Employee Salary : " + esalary);
		System.out.println("Employee Name : " + ename);
	}
	
	public Employee(int eid,String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public void setSalary(double esalary) { //Setter Method
		this.esalary = esalary;
	}
	
	public void getSalary() { //Getter Method
		System.out.println("Salary : " + this.esalary);
	}
	
	public void setName(String ename) { //Setter Method
		this.ename = ename;
	}
	
	public void getName() { //Getter Method
		System.out.println("Name : " + this.ename);
	}
	
	public void setEid(int eid) { //Setter Method
		this.eid = eid;
	}
	
	public void getEid() { //Getter Method
		System.out.println("Eid : " + this.eid);
	}
	
}
