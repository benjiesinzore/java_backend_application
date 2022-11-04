package com.javaAssignment.controllers.administration;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.models.responses.administration.AccValidationRemResp;
import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

        response = service.adminCreateAccount();

        return response;
    }


    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public GlobalResponse adminLogin(){

        response = service.adminLogin();

        return response;
    }

    @PostMapping("/ValidateCustomerAccount")
    public GlobalResponse validateCustomerAccount(){

        response = service.validateCustomerAccount();
        return response;
    }

    @PostMapping("/BlockCustomerAccount")
    public GlobalResponse blockCustomerAccount(){

        response = service.blockCustomerAccount();
        return response;
    }


    @PostMapping("/TestSqlMapping")
    public AccValidationRemResp getTestSqlMapping(){

        AccValidationRemResp res;
        res = service.getTestSqlMapping();
        return res;
    }


}
