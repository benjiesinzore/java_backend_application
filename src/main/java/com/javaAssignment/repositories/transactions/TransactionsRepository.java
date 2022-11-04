package com.javaAssignment.repositories.transactions;

import com.javaAssignment.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;

@Repository
public interface TransactionsRepository extends JpaRepository<MyEntity, Integer> {


    @Procedure(procedureName = "sp_CustomerTransactionDetails_Withdraw")
    String cashWithdraw(

            @Param("accountNumberIN")
            BigInteger accountNumberIN,

            @Param("amountIN")
            double amountIN,

            @Param("userPasswordIN")
            String userPassword
    );

    @Procedure(procedureName = "sp_CustomerTransactionDetails_Deposit")
    String cashDeposit(

            @Param("accountNumberIN")
            BigInteger accountNumberIN,

            @Param("amountIN")
            double amountIN
    );

    @Procedure(procedureName = "sp_CustomerTransaction_TransferFunds")
    String cashTransfer(

            @Param("accountNumberIN")
            BigInteger accountNumberIN,

            @Param("accountNumberToSendToIN")
            BigInteger accountNumberToSendToIN,

            @Param("amountIN")
            double amountIN,

            @Param("userPasswordIN")
            String userPassword
    );

    @Procedure(procedureName = "sp_GetAvailableBalance")
    String checkAvailableBalance(

            @Param("accountNumberIN")
            int accountNumberIN
    );

    @Procedure(procedureName = "sp_DeactivateAccount")
    String customerRequestDeactivateAccount(

            @Param("accountNumberIN")
            int accountNumberIN
    );

}
