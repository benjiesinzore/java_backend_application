package com.javaAssignment.controllers.transactions;

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


    @PostMapping("/CashWithdraw")
    public String cashWithdraw(){

        String ss;
        ss = service.cashWithdraw();
        return ss;
    }

    @PostMapping("/CashDeposit")
    public String cashDeposit(){

        String ss;
        ss = service.cashDeposit();
        return ss;
    }

    @PostMapping("/CashTransfer")
    public String cashTransfer(){

        String ss;
        ss = service.cashTransfer();
        return ss;
    }

    @PostMapping("/CheckAvailableBalance")
    public String checkAvailableBalance(){

        String ss;
        ss = service.checkAvailableBalance();
        return ss;
    }

    @PostMapping("/CustomerRequestDeactivateAccount")
    public String customerRequestDeactivateAccount(){

        String ss;
        ss = service.customerRequestDeactivateAccount();
        return ss;
    }

}
