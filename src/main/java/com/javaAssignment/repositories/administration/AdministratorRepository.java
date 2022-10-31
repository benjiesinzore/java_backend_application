package com.javaAssignment.repositories.administration;

import com.javaAssignment.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<MyEntity, Integer> {


    @Procedure()
    public String adminCreateAccount();

    @Procedure()
    public String adminLogin();

    @Procedure()
    public String validateCustomerAccount();

    @Procedure()
    public String blockCustomerAccount();

    @Procedure()
    public String freezeCustomerSavings();

    @Procedure()
    public String validateLoan();
}
