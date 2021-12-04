package com.saien.aop.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.saien.aop.springboot.aop.model.Employee;

/**
 * @author Paiker Abbas
 *
 */
@Aspect
@Component
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.saien.aop.springboot.aop.service.EmployeeService.*(..)) and args(employee)")
	public void beforeAdvice(JoinPoint joinPoint, Employee employee) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee with name - " + employee.getName() + " and id - " + employee.getEmpId());
	}

	@After(value = "execution(* com.saien.aop.springboot.aop.service.EmployeeService.*(..)) and args(employee)")
	public void afterAdvice(JoinPoint joinPoint, Employee employee) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + employee.getName() + " and id - " + employee.getEmpId());
	}
}
