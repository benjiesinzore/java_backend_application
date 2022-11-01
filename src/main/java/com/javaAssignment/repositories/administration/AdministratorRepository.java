package com.javaAssignment.repositories.administration;

import com.javaAssignment.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import java.util.List;

@Repository
public interface AdministratorRepository extends JpaRepository<MyEntity, Integer> {


    @Procedure(procedureName = "sp_BankEmployeeRegistrationDetails")
    String adminCreateAccount(

            @Param("employeeIDIN")
            int employeeIDIN,

            @Param("employeePasswordIN")
            String employeePasswordIN,

            @Param("employeeNameIN")
            String employeeNameIN,

            @Param("employeeCapacityIN")
            String employeeCapacityIN
    );

    @Procedure(procedureName = "sp_BankEmployeeLogin")
    String adminLogin(

            @Param("employeeIDIN")
            String employeeIDIN,

            @Param("employeePasswordIN")
            String employeePasswordIN
    );


    @Procedure(procedureName = "sp_CustomerValidationReminder")
    List<String> accValidationReminder();

    @Procedure(procedureName = "sp_ApproveCustomer")
    public String validateCustomerAccount(

            @Param("accountNumberIN")
            String accountNumberIN
    );

    @Procedure()
    public String blockCustomerAccount();

    @Procedure()
    public String freezeCustomerSavings();

    @Procedure()
    public String validateLoan();
}
