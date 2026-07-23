package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.coforge.dms.model.Department;

public interface DepartmentService {
	public boolean addDepartment(Department department);
	
	public boolean updateDepartment(int id);
	
	public boolean deleteDepartment(int id);
	
	public Optional<Department> getDepartmentById(int id);

	public Iterable<Department> getAllDepartments();

	public Optional<Department> getDepartmentByName(String deptName);
	
	public boolean deleteDepartmentByName(String deptName);
	
	public List<Integer> getAllDepartmentIds();
	
}
