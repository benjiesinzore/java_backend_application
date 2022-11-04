package com.javaAssignment.services.security;

import com.javaAssignment.models.requestbody.security.CustomerReg;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.repositories.security.SecurityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;


@Transactional
@Service
public class SecurityService {

    @Autowired
    private final SecurityRepository repository;
    GlobalResponse response = new GlobalResponse();

    public SecurityService(SecurityRepository repository) {
        this.repository = repository;
    }

    private final Logger logger = LoggerFactory.getLogger(SecurityService.class);

    public GlobalResponse customerRegistration(CustomerReg model){

        String password = model.getUserPassword();
        String conPassword = model.getConfirmPassword();
        if (Objects.equals(password, conPassword)){

            String res;
            try {
                res = repository.customerRegistration(123,"","","");
                response.setMessage(res);
            } catch (Exception ee){
                String error = ee.getMessage();
                logger.error(error);
                logger.info("Customer Registration Endpoint : Security Controller");
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

    public GlobalResponse customerLogin(){
        String res;
        try {
            res = repository.customerLogin("100100123","");
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Customer Login Endpoint : Security Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");
        }

        return response;
    }

    public GlobalResponse customerRequestPinChange(){
        String res;
        try {
            res = repository.customerRequestPinChange(123,"","",
                    "");
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Customer Request PIN Change Endpoint : Security Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");
        }

        return response;
    }
}
