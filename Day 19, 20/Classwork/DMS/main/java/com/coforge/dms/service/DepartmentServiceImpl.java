package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.dms.exception.DepartmentNotFoundException;
import com.coforge.dms.model.Department;
import com.coforge.dms.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepo repo;
	private Environment environment;

	@Autowired
	public DepartmentServiceImpl(DepartmentRepo repo, Environment environment) {
		super();
		this.repo = repo;
		this.environment = environment;
	}

	@Override
	public boolean addDepartment(Department department) {
		repo.save(department);
		return true;
	}

	@Override
	public boolean updateDepartment(int id) {
		Optional<Department> department = repo.findByDeptNo(id);
		if (department.isPresent()) {
			repo.save(department.get());
			return true;
		}
		throw new DepartmentNotFoundException(environment.getProperty("dms.invalid.notfound"));
	}

	@Override
	public boolean deleteDepartment(int id) {
		Optional<Department> department = repo.findByDeptNo(id);
		if (department.isPresent()) {
			repo.deleteByDeptNo(id);
			return true;
		}
		throw new DepartmentNotFoundException(environment.getProperty("dms.invalid.notfound"));
	}

	@Override
	public Optional<Department> getDepartmentById(int id) {
		return repo.findByDeptNo(id);

	}

	@Override
	public Iterable<Department> getAllDepartments() {
		return repo.findAll();
	}

	public Optional<Department> getDepartmentByName(String deptName) {
		return repo.findByDeptName(deptName);
	}

	@Override
	@Transactional
	public boolean deleteDepartmentByName(String deptName) {
		return repo.deleteByDeptName(deptName) > 0;
	}

	@Override
	public List<Integer> getAllDepartmentIds() {
		return repo.getAllDepartmentIds();
	}

}
