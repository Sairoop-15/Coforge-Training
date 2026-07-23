package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.dto.DepartmentDTO;
import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;
import com.coforge.ems.service.client.DepartmentClient;

@Service
public  class EmployeeServiceImpl implements EmployeeService {
	Environment environment;
	private EmployeeRepo repo;
	private DepartmentClient departmentClient;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo, Environment environment, DepartmentClient departmentClient) {
		super();
		this.repo = repo;
		this.environment = environment;
		this.departmentClient = departmentClient;
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		repo.save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(int eid, Employee employee) {

		if (!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.save(employee); // save here works as update if record exists
		return true;
	}

	@Override
	public boolean deleteByEid(int eid) {

		if (!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		repo.deleteById(eid);
		return true;
	}

	@Override
	public Optional<Employee> findByEid(int eid) {

		if (!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return repo.findById(eid);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) repo.findAll();
	}

	@Override
	public List<Employee> findByEname(String ename) {

		List<Employee> employees = repo.findByempName(ename);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return employees;

	}

	@Override
	@Transactional
	public boolean deleteByEname(String ename) {

		int n = repo.deleteByempName(ename);
		if (n == 0) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.employee-notfound"));
		}
		return true;

	}

	@Override
	public List<Integer> getEidsList() {
		return repo.getEids();
	}

	@Override
	public String getInfo() {
		return repo.getInfo();
	}
	
	//Rest Service Methods for Feign Client
	
	@Override
	public DepartmentDTO findDepartmentByDeptNo(int deptNo) {
		DepartmentDTO department = departmentClient.getDepartmentByDeptNo(deptNo);
		return department;
	}

	@Override
	public List<DepartmentDTO> findAllDepartments() {
		List<DepartmentDTO> departments = departmentClient.getAllDepartments();
		return departments;
	}
}