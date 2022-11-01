package com.javaAssignment.controllers.testContrller;


import com.javaAssignment.services.testService.TestService;
import com.javaAssignment.entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


@RestController()
@RequestMapping("/BankingTest")
public class SecurityControllerTest {

    @Autowired
    TestService testService;


    @GetMapping("/getHelloBenjie")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getHelloBenjie(){
        List<String> ss = new ArrayList<>();

        ss = testService.getGreetings();
        return ss;
    }

    @RequestMapping(value = "/TestSQLite", method = RequestMethod.POST)
    public String testSQLite(){
        String ss = "";

        return ss;
    }

}
