package com.saien.aop.springbootaopdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saien.aop.springbootaopdemo.data.Dao2;

/**
 * @author Paiker Abbas
 *
 */
@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() throws Exception {
        //Business Logic
        return dao2.retrieveSomething();
    }
    
}
