package com.coforge.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	Employee employee;

	@Autowired // Annotation for Dependency Injection using Annotation
	private EmployeeService service;

	@RequestMapping("home")
	public ModelAndView loadHomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		return mv; // Servlet Dispatcher forward
	}

	@RequestMapping(method = RequestMethod.POST, value = "employee", params = "Insert")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		Boolean status = service.createEmployee(employee);
		String result = "";

		if (status == true)
			result = "SUCCESS : Employee Object Saved";
		else
			result = "FAILURE : Employee Object not Saved";

		mv.addObject("result", result);

		return mv;
	}

	@RequestMapping(value = "employee", params = "Update")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		Boolean status = service.updateEmployee(employee);
		String result = "";

		if (status == true)
			result = "SUCCESS : Employee Object Updated";
		else
			result = "FAILURE : Employee Object not Updated";

		mv.addObject("result", result);

		return mv;
	}

	@RequestMapping(value = "employee", params = "Delete")
	public ModelAndView deleteEmployee(@RequestParam int eid) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		Boolean status = service.deleteEmployee(eid);
		String result = "";

		if (status == true)
			result = "SUCCESS : Employee Object Deleted";
		else
			result = "FAILURE : Employee Object not Deleted";

		mv.addObject("result", result);

		return mv;
	}

	@RequestMapping(value = "employee", params = "Find")
	public ModelAndView findEmployee(@RequestParam int eid) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		String result = "";

		employee = service.findEmployee(eid);

		if (employee != null)
			result = employee.toString();
		else
			result = "FAILURE : Employee Object not Found";

		mv.addObject("result", result);

		return mv;
	}

	@RequestMapping(value = "employee", params = "FindAll")
	public ModelAndView findAllEmployee() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeHome");
		List<Employee> list = service.findAllEmployee();

		mv.addObject("result", list);

		return mv;
	}
}
