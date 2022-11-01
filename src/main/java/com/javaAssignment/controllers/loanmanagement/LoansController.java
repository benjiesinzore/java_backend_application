package com.javaAssignment.controllers.loanmanagement;

import com.javaAssignment.services.loanManagement.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/BankingTest")
public class LoansController {

    @Autowired
    LoansService service;


    @PostMapping("/BorrowLoan")
    public String borrowLoan(){

        return "ss";
    }


    @PostMapping("/PayLoan")
    public String payLoan(){

        return "ss";
    }


    @PostMapping("/CheckLoanHistory")
    public String checkLoanHistory(){

        return "ss";
    }
}
