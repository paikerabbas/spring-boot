package com.saien.aop.springbootaopdemo.data;

import org.springframework.stereotype.Repository;

/**
 * @author Paiker Abbas
 *
 */
@Repository
public class Dao1 {

    public String retrieveSomething() {
        return "Data inside Dao1";
    }
    
    public String logicForAroundAdvice() {
    	return "Around advice is executed";
    }
}
