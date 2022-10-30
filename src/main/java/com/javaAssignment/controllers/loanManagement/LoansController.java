package com.javaAssignment.controllers.loanManagement;

import com.javaAssignment.services.loanManagement.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("BankingTest")
public class LoansController {

    @Autowired
    LoansService service;
}
