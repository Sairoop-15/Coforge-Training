package com.coforge.Day6.Java8;

import java.util.Optional;

class Employee {
	private String ename;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}

public class OptionalTest {

	public static Optional<Employee> getEmployee() {
		Employee employee = new Employee();
		employee.setEname("Neeraj");
		Optional<Employee> optionalEmployee = Optional.ofNullable(employee);

		return optionalEmployee;

	}

	public static void main(String[] args) {
		Optional<Employee> optionalEmployee = getEmployee();

		if (optionalEmployee.isPresent()) {
			Employee employee = optionalEmployee.get();
			System.out.println(employee.getEname());
		} else {
			System.out.println("Employee Not Present");
		}

	}

}
