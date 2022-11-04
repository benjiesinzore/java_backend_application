package com.javaAssignment.services.security;

import com.javaAssignment.models.requestbody.security.CustomerLoginModel;
import com.javaAssignment.models.requestbody.security.CustomerRegModel;
import com.javaAssignment.models.requestbody.security.CustomerRequestPinChangeModel;
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

    public GlobalResponse customerRegistration(CustomerRegModel model){

        String password = model.getUserPassword();
        String conPassword = model.getConfirmPassword();
        if (Objects.equals(password, conPassword)){

            String res;
            try {
                res = repository.customerRegistration(
                        model.getUserID(),
                        model.getUserName(),
                        model.getUserPassword(),
                        model.getUserEmailAddress());

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

    public GlobalResponse customerLogin(CustomerLoginModel model){
        String res;
        try {
            res = repository.customerLogin(
                    model.getUserAccountNumber(),
                    model.getUserPassword());

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

    public GlobalResponse customerRequestPinChange(CustomerRequestPinChangeModel model){
        String res;
        try {
            res = repository.customerRequestPinChange(
                    model.getUserAccountNumber(),
                    model.getUserName(),
                    model.getUserPassword(),
                    model.getRequestDate());

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
