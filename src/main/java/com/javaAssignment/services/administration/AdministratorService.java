package com.javaAssignment.services.administration;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.models.responses.administration.AccValidationRemModel;
import com.javaAssignment.models.responses.administration.AccValidationRemModelData;
import com.javaAssignment.repositories.administration.AdministratorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


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


    public GlobalResponse adminCreateAccount(){
        String res;
        try {

            res = repository.adminCreateAccount(
                    33, "", "", "");
            response.setMessage(res);
        } catch (Exception ee){
            String error = ee.getMessage();

            logger.error(error);
            logger.info("Create Admin Endpoint : Administration Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return response;
    }


    public GlobalResponse adminLogin(){
        String res;
        try {
            res = repository.adminLogin("22", "");
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

    public List<AccValidationRemModel> accValidationReminder(){


        List<AccValidationRemModel> ss = new ArrayList<>();
        try {
            ss = (List<AccValidationRemModel>) repository.accValidationReminder();
        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Customer Validation Reminder Endpoint : Administration Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

        }

        return ss;
    }

    public GlobalResponse validateCustomerAccount(){
        String res;
        String acc = "";
        try {
            res = repository.validateCustomerAccount(acc);
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


    public GlobalResponse blockCustomerAccount(){
        String res;
        try {
            res = repository.blockCustomerAccount("", "", "",
                    "");
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









    public List<AccValidationRemModelData> getTestSqlMapping(){

        List<AccValidationRemModelData> data = new ArrayList<>();
        try {
            data = repository.getTestSqlMapping();
        } catch (Exception ee){

            String error = ee.getMessage();
            logger.error(error);
            logger.info("Test SQL Mapping Endpoint : Administration Controller");
        }
        return data;
    }

}
