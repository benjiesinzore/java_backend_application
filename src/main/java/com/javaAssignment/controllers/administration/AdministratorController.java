package com.javaAssignment.controllers.administration;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.models.responses.administration.AccValidationRemModel;
import com.javaAssignment.models.responses.administration.AccValidationRemModelData;
import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/BankingTest")
public class AdministratorController {

    @Autowired
    private final AdministratorService service;
    public AdministratorController(AdministratorService service) {
        this.service = service;
    }
    private GlobalResponse response = new GlobalResponse();

    @PostMapping("/AdminCreateAccount")
    public GlobalResponse adminCreateAccount(){

        String ss;
        response = service.adminCreateAccount();

        return response;
    }


    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public GlobalResponse adminLogin(){

        String ss;
        response = service.adminLogin();

        return response;
    }


    @PostMapping("/CustomerAccValidationReminder")
    public List<AccValidationRemModel> customerAccValidationReminder(){

        List<AccValidationRemModel> ss = new ArrayList<>();
        ss = service.accValidationReminder();
        return ss;
    }

    @PostMapping("/ValidateCustomerAccount")
    public GlobalResponse validateCustomerAccount(){

        String ss;
        response = service.validateCustomerAccount();
        return response;
    }

    @PostMapping("/BlockCustomerAccount")
    public GlobalResponse blockCustomerAccount(){

        String ss;
        response = service.blockCustomerAccount();
        return response;
    }


    @PostMapping("/TestSqlMapping")
    public List<AccValidationRemModelData> getTestSqlMapping(){

        List<AccValidationRemModelData> data = new ArrayList<>();
        data = service.getTestSqlMapping();
        return data;
    }

}
