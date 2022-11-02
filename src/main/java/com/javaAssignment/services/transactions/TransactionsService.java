package com.javaAssignment.services.transactions;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.repositories.transactions.TransactionsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional
@Service
public class TransactionsService {

    @Autowired
    private final TransactionsRepository repository;
    public TransactionsService(TransactionsRepository repository) {
        this.repository = repository;
    }

    private final GlobalResponse response = new GlobalResponse();


    public GlobalResponse cashDeposit(){
        String res = "";
        try {
            res = repository.cashDeposit(11,11);
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            log.error(error);
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse cashWithdraw(){
        String res = "";
        try {
            res = repository.cashWithdraw(11,11);
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            log.error(error);
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse cashTransfer(){
        String res = "";
        try {
            res = repository.cashTransfer(11,11, 11);
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            log.error(error);
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse checkAvailableBalance(){
        String res = "";
        try {
            res = repository.checkAvailableBalance(11);
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            log.error(error);
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }

    public GlobalResponse customerRequestDeactivateAccount(){
        String res = "";
        try {
            res = repository.customerRequestDeactivateAccount(11);
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            log.error(error);
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }
}
