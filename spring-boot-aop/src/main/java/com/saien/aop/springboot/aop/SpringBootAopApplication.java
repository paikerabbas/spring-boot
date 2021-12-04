package com.saien.aop.springboot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Paiker Abbas
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopApplication.class, args);
	}

}
