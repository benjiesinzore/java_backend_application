package com.javaAssignment.services.administration;

import com.javaAssignment.models.requestbody.administration.AdminCreateAccountModel;
import com.javaAssignment.models.requestbody.administration.AdminLoginModel;
import com.javaAssignment.models.requestbody.administration.BlockCustomerAccountModel;
import com.javaAssignment.models.requestbody.administration.ValidateCustomerAccModel;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.entity.AccValidationRemModelData;
import com.javaAssignment.models.responses.administration.AccValidationRemResp;
import com.javaAssignment.repositories.administration.AdministratorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Objects;


@Transactional
@Service
public class AdministratorService {

    @Autowired
    private final AdministratorRepository repository;
    public AdministratorService(AdministratorRepository repository) {
        this.repository = repository;
    }

    private final GlobalResponse response = new GlobalResponse();
    private final Logger logger = LoggerFactory.getLogger(AdministratorService.class);


    public GlobalResponse adminCreateAccount(AdminCreateAccountModel model){

        String password = model.getEmployeePassword();
        String confirmPassword = model.getConfirmPassword();
        if (Objects.equals(password, confirmPassword)){

            try {

                String res;
                res = repository.adminCreateAccount(
                        model.getEmployeeID(),
                        model.getEmployeePassword(),
                        model.getEmployeeName(),
                        model.getEmployeeCapacity());
                response.setMessage(res);

            } catch (Exception ee){
                String error = ee.getMessage();

                logger.error(error);
                logger.info("Create Admin Endpoint : Administration Controller");
                response.setStatus(500);
                response.setError(error);
                response.setMessage("Internal Server Error.");

            }

        } else {

            response.setStatus(401);
            response.setError("Bad request.");
            response.setMessage("Please ensure the passwords match.");
        }



        return response;
    }


    public GlobalResponse adminLogin(AdminLoginModel model){
        String res;
        try {
            res = repository.adminLogin(
                    model.getEmployeeID(),
                    model.getEmployeePassword());
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Admin Login Endpoint : Administration Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }

    public GlobalResponse validateCustomerAccount(ValidateCustomerAccModel model){
        String res;
        try {
            res = repository.validateCustomerAccount(
                    model.getAccountNumber()
            );
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Validate Customer Account Endpoint : Administration Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse blockCustomerAccount(BlockCustomerAccountModel model){
        String res;
        try {
            res = repository.blockCustomerAccount(
                    model.getAccountNumber(),
                    model.getReasonForBlock(),
                    model.getDateInitiated(),
                    model.getBlockedBy()
            );

            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Block Customer Account Endpoint : Administration Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }

    public AccValidationRemResp accountValidationReinder(){

        AccValidationRemResp res = new AccValidationRemResp();
        List<AccValidationRemModelData> data;
        try {
            data = repository.accountValidationReinder();
            res.setData(data);
        } catch (Exception ee){

            String error = ee.getMessage();
            logger.error(error);
            logger.info("Test SQL Mapping Endpoint : Administration Controller");
            res.setStatus(500);
            res.setError(error);
        }
        return res;
    }

}
