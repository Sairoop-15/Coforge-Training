package com.coforge.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee {

    @Id
    @Column(name = "eid")
    private int empId;

    @Column(name = "ename", length = 100)
    private String empName;
    
    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private int empSalary;

    @Column(name = "dno")
    private int deptNo;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", empSalary=" + empSalary
				+ ", deptNo=" + deptNo + "]";
	}

	public Employee(int empId, String empName, String email, int empSalary, int deptNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.empSalary = empSalary;
		this.deptNo = deptNo;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

   
}