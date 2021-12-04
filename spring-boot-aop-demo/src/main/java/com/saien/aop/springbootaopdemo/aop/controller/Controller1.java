package com.saien.aop.springbootaopdemo.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saien.aop.springbootaopdemo.service.Business1;

/**
 * @author Paiker Abbas
 *
 */
@RestController
public class Controller1 {
	
	@Autowired
	private Business1 business1;
	
	@GetMapping("/business1")
	public String calculateSomething() {
		return business1.calculateSomething();
	}

}
