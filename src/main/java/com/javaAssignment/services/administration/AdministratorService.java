package com.javaAssignment.services.administration;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.repositories.administration.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    public GlobalResponse adminCreateAccount(){
        String res;
        try {
            res = repository.adminCreateAccount(
                    33, "", "", "");
            response.setMessage(res);
        } catch (Exception ee){

        }

        return response;
    }


    public GlobalResponse adminLogin(){
        String res;
        try {
            res = repository.adminLogin("22", "");
            response.setMessage(res);
        } catch (Exception ee){

        }

        return response;
    }

    public List<String> accValidationReminder(){
        List<String> ss = new ArrayList<>();
        try {
            ss = repository.accValidationReminder();
        } catch (Exception ee){

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

        }

        return response;
    }


    public GlobalResponse blockCustomerAccount(){
        String res;
        String acc = "";
        try {
            res = repository.blockCustomerAccount("", "", "",
                    "");
            response.setMessage(res);
        } catch (Exception ee){

        }

        return response;
    }

}
