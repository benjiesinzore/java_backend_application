package com.javaAssignment.repositories.transactions;

import com.javaAssignment.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface TransactionsRepository extends JpaRepository<MyEntity, Integer> {


    @Procedure
    public String cashWithdraw();

    @Procedure
    public String cashDeposit();

    @Procedure
    public String cashTransfer();

    @Procedure
    public String checkAvailableBalance();

    @Procedure
    public String customerRequestDeactivateAccount();

    @Procedure
    public String mimistatement();
}
