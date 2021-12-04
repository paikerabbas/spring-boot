package com.saien.aop.springbootaopdemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author Paiker Abbas
 *
 */
@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "execution(* com.saien.aop.springbootaopdemo.service.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("After Returning Advice :: after execution of {} returned with value {}", joinPoint, result);
	}

	@After(value = "execution(* com.saien.aop.springbootaopdemo.service.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("After Advice ::  after execution of {}", joinPoint);
	}

	@AfterThrowing(value = "execution(* com.saien.aop.springbootaopdemo.service.*.*(..))", throwing = "error")
	public void afterThrowingAdvice(JoinPoint joinPoint, Throwable error) {
		logger.info("After Throwing Advice ::  on execution of {} getting this error {}", joinPoint, error);
	}

}
