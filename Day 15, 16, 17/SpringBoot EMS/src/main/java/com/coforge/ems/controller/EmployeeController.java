package com.coforge.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController // @Controller + @ResponseBody
@RequestMapping("/api/v1/ems")
public class EmployeeController {

	private EmployeeService service;
	private Environment environment;

	@Autowired // constructor Injection
	public EmployeeController(EmployeeService service, Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}

	@PostMapping("/employees")
	public ResponseEntity<String> saveEmployee(@NotNull @Valid @RequestBody Employee employee) {
		boolean status = service.saveEmployee(employee);
		if (status)
			return new ResponseEntity<>(environment.getProperty("ems.save.success"), HttpStatus.CREATED);
		return new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/employees/{eid}")
	public ResponseEntity<String> updateEmployee(@NotNull @Valid @PathVariable("eid") int eid, @RequestBody Employee employee) {
		boolean status = service.updateEmployee(eid, employee);
		if (status)
			return new ResponseEntity<>(environment.getProperty("ems.update.success"), HttpStatus.CREATED);
		return new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/employees/{eid}")
	public ResponseEntity<String> deleteByEid(@NotNull @Valid @PathVariable("eid") int eid) {
		boolean status = service.deleteByEid(eid);
		if (status)
			return new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.OK);
		return new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/employees/{eid}")
	public ResponseEntity<?> findByEid(@PathVariable("eid") int eid) {
		Optional<Employee> employee = service.findByEid(eid);
		if (employee.isPresent())
			return new ResponseEntity<>(employee.get(), HttpStatus.OK);
		return new ResponseEntity<>(environment.getProperty("ems.db.failed"), HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/employees")
	public ResponseEntity<?> findAllEmployees() {
		List<Employee> employees = service.findAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	@GetMapping("/employees/ename/{ename}")
	public ResponseEntity<?> findByEname(@PathVariable("ename") String ename) {
		List<Employee> employees = service.findByEname(ename);
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	@DeleteMapping("/employees/ename/{ename}")
	public ResponseEntity<?> deleteByEname(@NotNull @Valid @PathVariable("ename") String ename) {
		service.deleteByEname(ename);
		return new ResponseEntity<>(environment.getProperty("ems.delete.success"), HttpStatus.OK);
	}

	@GetMapping("/employees/eids")
	public ResponseEntity<?> getEidsList() {
		List<Integer> eids = service.getEidsList();
		return new ResponseEntity<>(eids, HttpStatus.OK);
	}

	@GetMapping("/employees/info")
	public ResponseEntity<?> getInfo() {
		String info = service.getInfo();
		return new ResponseEntity<>(info, HttpStatus.OK);
	}

}