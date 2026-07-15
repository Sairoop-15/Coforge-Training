package com.coforge.model;

public class Employee {
	private int empid;
	private String empname;
	private String email;
	private int salary;
	private int dno;
	private Address address;
	private Project project;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", email=" + email + ", salary=" + salary
				+ ", dno=" + dno + ", address=" + address + ", project=" + project + "]";
	}

	public Employee(int empid, String empname, String email, int salary, int dno, Address address, Project project) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.salary = salary;
		this.dno = dno;
		this.address = address;
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
