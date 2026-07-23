package com.coforge.dms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "tbl_department")
public class Department {

	@Id
	@Column(name = "id")
	@NotNull
	private int id;
	
	@Column(name = "dept_no")
	@Positive
	private int deptNo;
	
	@Column(name = "dept_name")
	@NotBlank
	private String deptName;

	public Department(int id, int deptNo, String deptName) {
		super();
		this.id = id;
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
