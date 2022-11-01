package com.javaAssignment.services.administration;

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
    AdministratorRepository repository;


    public String adminCreateAccount(){
        String ss;
        ss = repository.adminCreateAccount(
                33, "", "", "");
        return ss;
    }


    public String adminLogin(){
        String ss;
        ss = repository.adminLogin("22", "");
        return ss;
    }

    public List<String> accValidationReminder(){
        List<String> ss = new ArrayList<>();
        ss = repository.accValidationReminder();
        return ss;
    }

}
