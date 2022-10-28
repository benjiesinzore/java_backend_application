package com.javaAssignment.Services;

import com.javaAssignment.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class TestService {

    @Autowired
    TestRepository repository;

    public TestService() {
    }

    public String getGreetings(){

        String ss, name = "Benjamin Sinzore";

        try {
            ss = repository.getGreetings(name);
        } catch (Exception ee){
            ss = ee.getMessage();
        }
        return ss;
    }
}
