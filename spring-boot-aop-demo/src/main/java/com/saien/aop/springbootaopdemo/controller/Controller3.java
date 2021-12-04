package com.saien.aop.springbootaopdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saien.aop.springbootaopdemo.service.Business3;

/**
 * @author Paiker Abbas
 *
 */
@RestController
public class Controller3 {
	
	@Autowired
	private Business3 business3;
	
	@GetMapping("/business3")
	public String calculateSomething() throws Exception {
		return business3.logicForAroundAdvice();
	}

}
