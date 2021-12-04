package com.saien.aop.springbootaopdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saien.aop.springbootaopdemo.data.Dao3;

/**
 * @author Paiker Abbas
 *
 */
@Component
public class Business3 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Dao3 dao3;

	public String logicForAroundAdvice() {
		String value = dao3.retrieveSomething();
		logger.info("inside around advice business logic--{}", value);
		return value;
	}

}
