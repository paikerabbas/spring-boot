package com.saien.aop.springboot.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saien.aop.springboot.aop.model.Employee;
import com.saien.aop.springboot.aop.service.EmployeeService;

/**
 * @author Paiker Abbas
 *
 */
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@DeleteMapping("/employee/{empId}")
	public void removeEmployee(@PathVariable String empId) {
		employeeService.deleteEmployee(empId);
	}
}
