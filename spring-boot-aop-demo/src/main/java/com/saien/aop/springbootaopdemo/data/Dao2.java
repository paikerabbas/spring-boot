package com.saien.aop.springbootaopdemo.data;

import org.springframework.stereotype.Repository;

/**
 * @author Paiker Abbas
 *
 */
@Repository
public class Dao2 {
	public String retrieveSomething() throws Exception {
		// change below flag to true to check the AfterThrowing advice
		boolean flag = false;
		if (flag) {
			throw new Exception("error occured iside DAO2");
		}
		return "Data inside Dao2";
	}
}
