package com.javaAssignment.controllers.transactions;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.services.transactions.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<GlobalResponse> cashWithdraw(){

        response = service.cashWithdraw();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/CashDeposit")
    public ResponseEntity<GlobalResponse> cashDeposit(){

        response = service.cashDeposit();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/CashTransfer")
    public ResponseEntity<GlobalResponse> cashTransfer(){

        response = service.cashTransfer();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/CheckAvailableBalance")
    public ResponseEntity<GlobalResponse> checkAvailableBalance(){

        response = service.checkAvailableBalance();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/CustomerRequestDeactivateAccount")
    public ResponseEntity<GlobalResponse> customerRequestDeactivateAccount(){

        response = service.customerRequestDeactivateAccount();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
