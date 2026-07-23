package com.coforge.ems.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class DepartmentDTO {
		
	@NotNull
	private int id;	
	
	@Positive
	private int deptNo;
	
	@NotBlank
	private String deptName;

	public DepartmentDTO(int id, int deptNo, String deptName) {
		super();
		this.id = id;
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public DepartmentDTO() {
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
