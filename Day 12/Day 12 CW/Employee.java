package com.coforge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {
	@Id
	@Column(name = "eid")
	private int empId;
	
	@Column(name = "ename" )
	private String empname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "salary")
	private int salary;
	
	@Column(name = "dno")
	private int dno;
	
	public int getempId() {
		return empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salry) {
		this.salary = salry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", email=" + email + ", salary=" + salary
				+ ", dno=" + dno + "]";
	}

	public Employee(int empId, String empname, String email, int salary, int dno) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
		this.email = email;
		this.dno = dno;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
