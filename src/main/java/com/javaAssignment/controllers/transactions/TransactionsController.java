package com.javaAssignment.controllers.transactions;

import com.javaAssignment.models.requestbody.transactions.CashDepositModel;
import com.javaAssignment.models.requestbody.transactions.CashTransferModel;
import com.javaAssignment.models.requestbody.transactions.CashWithdrawModel;
import com.javaAssignment.models.requestbody.transactions.CheckAvailableBalanceModel;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.services.transactions.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/BankingTest")
public class TransactionsController {

    @Autowired
    TransactionsService service;
    protected ResponseEntity<GlobalResponse> response;


    @PostMapping("/CashWithdraw")
    public ResponseEntity<GlobalResponse> cashWithdraw(
            @RequestBody CashWithdrawModel model){

        response = service.cashWithdraw(model);
        return response;
    }

    @PostMapping("/CashDeposit")
    public ResponseEntity<GlobalResponse> cashDeposit(
            @RequestBody CashDepositModel model){

        response = service.cashDeposit(model);
        return response;
    }

    @PostMapping("/CashTransfer")
    public ResponseEntity<GlobalResponse> cashTransfer(
            @RequestBody CashTransferModel model){

        response = service.cashTransfer(model);
        return response;
    }

    @PostMapping(value = "/CheckAvailableBalance")
    public ResponseEntity<GlobalResponse> checkAvailableBalance(
            @RequestBody CheckAvailableBalanceModel model){

        response = service.checkAvailableBalance(model);
        return response;
    }

}
