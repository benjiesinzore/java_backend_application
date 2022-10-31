package com.javaAssignment.repositories.security;

import com.javaAssignment.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<MyEntity, Integer> {

    @Procedure(procedureName = "sp_CustomerRegistrationDetails")
    String customerRegistration(

            @Param("userIDIN")
            int userIDIN,

            @Param("userNameIN")
            String userNameIN,

            @Param("userPasswordIN")
            String userPasswordIN,

            @Param("userEmailAddressIN")
            String userEmailAddressIN
    );

    @Procedure
    public String customerLogin();

    @Procedure
    public String customerRequestPinChange();
}
