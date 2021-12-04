package com.saien.aop.springboot.aop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saien.aop.springboot.aop.model.Employee;

/**
 * @author Paiker Abbas
 *
 */
@Service
public class EmployeeService {

	public Employee createEmployee(Employee emp) {
		// below code is for the illustration purpose only.
		Employee employee = new Employee();
		employee.setName(emp.getName());
		employee.setEmpId(emp.getEmpId());
		System.out.println("Employee is created..." + emp.getName());
		return employee;
	}

	public void deleteEmployee(String empId) {
		System.out.println("Employee is deleted..." + empId);
	}
}
