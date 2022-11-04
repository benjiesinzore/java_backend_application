package com.javaAssignment.controllers.administration;

import com.javaAssignment.models.requestbody.administration.AdminCreateAccount;
import com.javaAssignment.models.requestbody.administration.AdminLogin;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.models.responses.administration.AccValidationRemResp;
import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<GlobalResponse> adminCreateAccount(@RequestBody AdminCreateAccount model){

        response = service.adminCreateAccount(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public ResponseEntity<GlobalResponse> adminLogin(@RequestBody AdminLogin model){

        response = service.adminLogin(model);
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
