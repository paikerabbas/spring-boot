package com.saien.aop.springbootaopdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.saien.aop.springbootaopdemo.service.Business1;
import com.saien.aop.springbootaopdemo.service.Business2;
import com.saien.aop.springbootaopdemo.service.Business3;

/**
 * @author Paiker Abbas
 *
 */
//@RunWith(SpringRunner.class) RunWith has been replaced by @ExtendWith in Junit 5
// though without @ExtendWith, also the tests are being executed successfully
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BusinessAopSpringBootTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;
	
	@Autowired
	private Business3 business3;

	@Test
	public void invokeAOPStuff() throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
		logger.info(business3.logicForAroundAdvice());
	}
}
