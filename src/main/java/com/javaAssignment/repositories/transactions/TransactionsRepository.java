package com.javaAssignment.repositories.transactions;

import com.javaAssignment.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<MyEntity, Integer> {


    @Procedure(procedureName = "sp_CustomerTransactionDetails_Withdraw")
    public String cashWithdraw(

            @Param("accountNumberIN")
            int accountNumberIN,

            @Param("amountIN")
            int amountIN
    );

    @Procedure(procedureName = "sp_CustomerTransactionDetails_Deposit")
    public String cashDeposit(

            @Param("accountNumberIN")
            int accountNumberIN,

            @Param("amountIN")
            int amountIN
    );

    @Procedure(procedureName = "sp_CustomerTransaction_TransferFunds")
    public String cashTransfer(

            @Param("accountNumberIN")
            int accountNumberIN,

            @Param("accountNumberToSendToIN")
            int accountNumberToSendToIN,

            @Param("amountIN")
            int amountIN
    );

    @Procedure(procedureName = "sp_GetAvailableBalance")
    public String checkAvailableBalance(

            @Param("accountNumberIN")
            int accountNumberIN
    );

    @Procedure(procedureName = "sp_DeactivateAccount")
    public String customerRequestDeactivateAccount(

            @Param("accountNumberIN")
            int accountNumberIN
    );

}
