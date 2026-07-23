package com.coforge.dms.controller;

import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dms.model.Department;
import com.coforge.dms.service.DepartmentService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/dms")
public class DepartmentController {
	
	private Environment environment;
	private DepartmentService service;
	
	@Autowired
	public DepartmentController(Environment environment, DepartmentService departmentService) {
		super();
		this.environment = environment;
		this.service = departmentService;
	}
	
	@PostMapping("/departments")
	public ResponseEntity<?> addDepartment(@Valid @NotNull @RequestBody Department department) {
		
		boolean result = service.addDepartment(department);
		if(result) 
			return new ResponseEntity<>(environment.getProperty("dms.department.add.success"),HttpStatus.CREATED);
		 else 
			return new ResponseEntity<>(environment.getProperty("dms.department.dberror"), HttpStatus.BAD_REQUEST);
		
	}
	
	@PutMapping("/departments/{deptNo}")
	public ResponseEntity<?> updateDepartment(@Valid @NotNull @PathVariable("deptNo") int deptNo) {
		
		boolean result = service.updateDepartment(deptNo);
		if(result) 
			return new ResponseEntity<>(environment.getProperty("dms.department.update.success"),HttpStatus.CREATED);
		 else 
			return new ResponseEntity<>(environment.getProperty("dms.department.dberror"), HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("/departments/{deptNo}")
	public ResponseEntity<?> deleteDepartment(@Valid @NotNull @PathVariable("deptNo") int deptNo){
		
		boolean result = service.deleteDepartment(deptNo);
		if(result) 
			return new ResponseEntity<>(environment.getProperty("dms.department.delete.success"),HttpStatus.OK);
		 else 
			return new ResponseEntity<>(environment.getProperty("dms.department.dberror"), HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/departments/{deptNo}")
	public ResponseEntity<?> getDepartmentByDeptNo(@PathVariable("deptNo") int deptNo){
		
		Optional<Department> department = service.getDepartmentById(deptNo);
		if(department.isPresent()) 
			return new ResponseEntity<>(department,HttpStatus.OK);
		 else 
			return new ResponseEntity<>(environment.getProperty("dms.department.notfound"), HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/departments")
	public ResponseEntity<?> getAllDepartments(){
		
		Iterable<Department> departments = service.getAllDepartments();
		return new ResponseEntity<>(departments, HttpStatus.OK);
	}
	
	@GetMapping("/departments/name/{deptName}")
	public ResponseEntity<?> getDepartmentByName(@PathVariable("deptName") String deptName){
		
		Optional<Department> department = service.getDepartmentByName(deptName);
		if(department.isPresent()) 
			return new ResponseEntity<>(department,HttpStatus.OK);
		 else 
			return new ResponseEntity<>(environment.getProperty("dms.department.notfound"), HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/departments/name/{deptName}")
	public ResponseEntity<?> deleteDepartmentByName(@PathVariable("deptName") String deptName){
		
		boolean result = service.deleteDepartmentByName(deptName);
		if(result) 
			return new ResponseEntity<>(environment.getProperty("dms.department.delete.success"),HttpStatus.OK);
		 else 
			return new ResponseEntity<>(environment.getProperty("dms.department.dberror"), HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/departments/ids")
	public ResponseEntity<?> getAllDepartmentIds(){
		
		return new ResponseEntity<>(service.getAllDepartmentIds(), HttpStatus.OK);
	}

}
