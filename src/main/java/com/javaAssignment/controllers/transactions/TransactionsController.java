package com.javaAssignment.controllers.transactions;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.services.transactions.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/BankingTest")
public class TransactionsController {

    @Autowired
    TransactionsService service;
    private GlobalResponse response = new GlobalResponse();


    @PostMapping("/CashWithdraw")
    public GlobalResponse cashWithdraw(){

        response = service.cashWithdraw();
        return response;
    }

    @PostMapping("/CashDeposit")
    public GlobalResponse cashDeposit(){

        response = service.cashDeposit();
        return response;
    }

    @PostMapping("/CashTransfer")
    public GlobalResponse cashTransfer(){

        response = service.cashTransfer();
        return response;
    }

    @PostMapping("/CheckAvailableBalance")
    public GlobalResponse checkAvailableBalance(){

        response = service.checkAvailableBalance();
        return response;
    }

    @PostMapping("/CustomerRequestDeactivateAccount")
    public GlobalResponse customerRequestDeactivateAccount(){

        response = service.customerRequestDeactivateAccount();
        return response;
    }

}
