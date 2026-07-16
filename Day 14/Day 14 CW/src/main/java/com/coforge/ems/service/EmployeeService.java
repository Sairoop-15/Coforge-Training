package com.coforge.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.coforge.ems.model.Employee;

@Service
public class EmployeeService {
	private List<Employee> list = new ArrayList<>();

	public Boolean createEmployee(Employee employee) {
		boolean status = list.add(employee);
		System.out.println(list);
		return status;
	}

	public Boolean updateEmployee(Employee employee) {
		for (int i = 0; i < list.size(); i++) {
			Employee emp = list.get(i);
			if (emp.getEid() == employee.getEid()) {
				list.remove(i);
				list.add(employee);
				return true;
			}
		}
		System.out.println(list);
		return false;
	}

	public Boolean deleteEmployee(int eid) {
		for (int i = 0; i < list.size(); i++) {
			Employee emp = list.get(i);
			if (emp.getEid() == eid) {
				list.remove(i);
				return true;
			}
		}
		System.out.println(list);
		return false;
	}

	public Employee findEmployee(int eid) {
		Employee emp = null;
		
		for (int i = 0; i < list.size(); i++) {
			emp = list.get(i);
			if (emp.getEid() == eid) {
				return emp;
			}
		}
		
		return emp;
	}

	public List<Employee> findAllEmployee() {
		return list;
	}
}
