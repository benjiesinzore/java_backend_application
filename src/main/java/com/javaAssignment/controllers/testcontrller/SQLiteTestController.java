package com.javaAssignment.controllers.testcontrller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/BankingTest")
public class SQLiteTestController {

    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String testSQLite(){
        return "Hello Benjamin.";
    }
}
