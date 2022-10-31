package com.javaAssignment.repositories.loanManagement;

import com.javaAssignment.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface LoansRepository extends JpaRepository<MyEntity, Integer> {

    @Procedure
    public String borrowLoan();

    @Procedure
    public String payLoan();

    @Procedure
    public String checkLoanLimit();

    @Procedure
    public String checkLoanHistory();
}
