package com.saien.aop.springbootaopdemo.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saien.aop.springbootaopdemo.service.Business2;

/**
 * @author Paiker Abbas
 *
 */
@RestController
public class Controller2 {
	
	@Autowired
	private Business2 business2;
	
	@GetMapping("/business2")
	public String calculateSomething() throws Exception {
		return business2.calculateSomething();
	}

}
