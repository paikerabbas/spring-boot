package com.saien.aop.springbootaopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author Paiker Abbas
 *
 */
@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.saien.aop.springbootaopdemo.data.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Before Advice :: Allowed execution for {}", joinPoint);
	}

	@Around("execution(* com.saien.aop.springbootaopdemo.service.Business3.logicForAroundAdvice(..))")
	public Object logBeforeAndAfterMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Before calling actual business logic"); // Before running actual business logic
		Object returnValue = joinPoint.proceed(); // business logic method gets executed
		logger.info("After calling actual business logic"); // After running actual business logic
		return returnValue;
	}

}
