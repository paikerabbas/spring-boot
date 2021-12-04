package com.saien.aop.springbootaopdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saien.aop.springbootaopdemo.data.Dao1;

/**
 * @author Paiker Abbas
 *
 */
@Service
public class Business1 {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Dao1 dao1;

	public String calculateSomething() {
		String value = dao1.retrieveSomething();
		logger.info("Inside Business Logic1--{}", value);
		return value;
	}

}
