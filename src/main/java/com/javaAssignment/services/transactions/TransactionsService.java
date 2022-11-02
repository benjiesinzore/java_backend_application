package com.javaAssignment.services.transactions;

import com.javaAssignment.repositories.transactions.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TransactionsService {

    @Autowired
    TransactionsRepository repository;


    public String cashDeposit(){
        String ss;
        ss = repository.cashDeposit(11,11);
        return ss;
    }


    public String cashWithdraw(){
        String ss = "";
        try {
            ss = repository.cashWithdraw(11,11);
        } catch (Exception ee){

        }

        return ss;
    }


    public String cashTransfer(){
        String ss = "";
        try {
            ss = repository.cashTransfer(11,11, 11);
        } catch (Exception ee){

        }

        return ss;
    }


    public String checkAvailableBalance(){
        String ss = "";
        try {
            ss = repository.checkAvailableBalance(11);
        } catch (Exception ee){

        }

        return ss;
    }

    public String customerRequestDeactivateAccount(){
        String ss = "";
        try {
            ss = repository.customerRequestDeactivateAccount(11);
        } catch (Exception ee){

        }

        return ss;
    }
}
