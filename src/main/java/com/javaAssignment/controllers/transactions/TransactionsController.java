package com.javaAssignment.controllers.transactions;

import com.javaAssignment.services.transactions.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("BankingTest")
public class TransactionsController {

    @Autowired
    TransactionsService service;
}
