package com.javaAssignment.services.transactions;

import com.javaAssignment.models.requestbody.transactions.CashDepositModel;
import com.javaAssignment.models.requestbody.transactions.CashTransferModel;
import com.javaAssignment.models.requestbody.transactions.CashWithdrawModel;
import com.javaAssignment.models.requestbody.transactions.CheckAvailableBalanceModel;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.repositories.transactions.TransactionsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TransactionsService {

    @Autowired
    private final TransactionsRepository repository;
    public TransactionsService(TransactionsRepository repository) {
        this.repository = repository;
    }

    protected GlobalResponse response = new GlobalResponse();

    protected Logger logger = LoggerFactory.getLogger(TransactionsService.class);


    public GlobalResponse cashDeposit(CashDepositModel model){
        String res = "";
        try {
            res = repository.cashDeposit(
                    model.getAccountNumber(),
                    model.getAmount()
            );
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Cash Deposit Endpoint : Transaction Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse cashWithdraw(CashWithdrawModel model){
        String res = "";
        try {
            res = repository.cashWithdraw(
                    model.getAccountNumber(),
                    model.getAmount(),
                    model.getUserPassword()
            );
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Cash Withdrawal Endpoint : Transaction Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse cashTransfer(CashTransferModel model){
        String res = "";
        try {
            res = repository.cashTransfer(
                    model.getAccountNumber(),
                    model.getAccountNumberToSendTo(),
                    model.getAmount(),
                    model.getUserPassword()
            );
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Cash Transfer Endpoint : Transaction Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse checkAvailableBalance(CheckAvailableBalanceModel model){
        String res = "";
        try {
            res = repository.checkAvailableBalance(
                    model.getAccountNumber(),
                    model.getUserPassword()
            );

            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Cash Deposit Endpoint : Transaction Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


}










