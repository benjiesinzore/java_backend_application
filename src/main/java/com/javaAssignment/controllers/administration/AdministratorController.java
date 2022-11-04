package com.javaAssignment.controllers.administration;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.models.responses.administration.AccValidationRemResp;
import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<GlobalResponse> adminCreateAccount(){

        response = service.adminCreateAccount();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public ResponseEntity<GlobalResponse> adminLogin(){

        response = service.adminLogin();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/ValidateCustomerAccount")
    public ResponseEntity<GlobalResponse> validateCustomerAccount(){

        response = service.validateCustomerAccount();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/BlockCustomerAccount")
    public ResponseEntity<GlobalResponse> blockCustomerAccount(){

        response = service.blockCustomerAccount();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PostMapping("/TestSqlMapping")
    public ResponseEntity<AccValidationRemResp> getTestSqlMapping(){

        AccValidationRemResp res;
        res = service.getTestSqlMapping();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }


}
