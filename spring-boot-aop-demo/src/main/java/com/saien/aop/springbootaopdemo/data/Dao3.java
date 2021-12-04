package com.saien.aop.springbootaopdemo.data;

import org.springframework.stereotype.Repository;

/**
 * @author Paiker Abbas
 *
 */
@Repository
public class Dao3 {

    public String retrieveSomething() {
        return "Data inside Dao3";
    }
    
}
