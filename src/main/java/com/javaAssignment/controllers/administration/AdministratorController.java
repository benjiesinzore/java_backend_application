package com.javaAssignment.controllers.administration;

import com.javaAssignment.models.requestbody.administration.AdminCreateAccountModel;
import com.javaAssignment.models.requestbody.administration.AdminLoginModel;
import com.javaAssignment.models.requestbody.administration.ValidateCustomerAccModel;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.models.responses.administration.AccValidationRemResp;
import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
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
    protected ResponseEntity<GlobalResponse> response;

    @PostMapping("/AdminCreateAccount")
    public ResponseEntity<GlobalResponse> adminCreateAccount(@RequestBody AdminCreateAccountModel model){

        response = service.adminCreateAccount(model);
        return response;
    }


    @PostMapping("/AdminLogin")
    public ResponseEntity<GlobalResponse> adminLogin(@RequestBody AdminLoginModel model){

        response = service.adminLogin(model);
        return response;
    }

    @PostMapping("/ValidateCustomerAccount")
    public ResponseEntity<GlobalResponse> validateCustomerAccount(@RequestBody ValidateCustomerAccModel model){

        response = service.validateCustomerAccount(model);
        return response;
    }


    @GetMapping("/AccountValidationReinder")
    public ResponseEntity<AccValidationRemResp> accountValidationReinder(){

        ResponseEntity<AccValidationRemResp> res;
        res = service.accountValidationReinder();
        return res;
    }

}
