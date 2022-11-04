package com.javaAssignment.controllers.administration;

import com.javaAssignment.models.requestbody.administration.AdminCreateAccountModel;
import com.javaAssignment.models.requestbody.administration.AdminLoginModel;
import com.javaAssignment.models.requestbody.administration.BlockCustomerAccountModel;
import com.javaAssignment.models.requestbody.administration.ValidateCustomerAccModel;
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
    public ResponseEntity<GlobalResponse> adminCreateAccount(@RequestBody AdminCreateAccountModel model){

        response = service.adminCreateAccount(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public ResponseEntity<GlobalResponse> adminLogin(@RequestBody AdminLoginModel model){

        response = service.adminLogin(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/ValidateCustomerAccount")
    public ResponseEntity<GlobalResponse> validateCustomerAccount(@RequestBody ValidateCustomerAccModel model){

        response = service.validateCustomerAccount(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/BlockCustomerAccount")
    public ResponseEntity<GlobalResponse> blockCustomerAccount(@RequestBody BlockCustomerAccountModel model){

        response = service.blockCustomerAccount(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @GetMapping("/AccountValidationReinder")
    public ResponseEntity<AccValidationRemResp> accountValidationReinder(){

        AccValidationRemResp res;
        res = service.accountValidationReinder();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
