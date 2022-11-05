package com.javaAssignment.controllers.security;

import com.javaAssignment.models.requestbody.security.CustomerLoginModel;
import com.javaAssignment.models.requestbody.security.CustomerRegModel;
import com.javaAssignment.models.requestbody.security.CustomerRequestPinChangeModel;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.services.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/BankingTest")
public class SecurityController {

    @Autowired
    private final SecurityService service;
    private SecurityController(SecurityService service) {
        this.service = service;
    }
    protected ResponseEntity<GlobalResponse> response;

    @PostMapping(value = "/CustomerRegistration")
    public ResponseEntity<GlobalResponse> customerRegistration(
            @RequestBody CustomerRegModel model){

        response = service.customerRegistration(model);
        return response;
    }

    @PostMapping("/CustomerLogin")
    public ResponseEntity<GlobalResponse> customerLogin(
            @RequestBody CustomerLoginModel model){

        response = service.customerLogin(model);
        return response;
    }

    @PostMapping("/CustomerRequestPinChange")
    public ResponseEntity<GlobalResponse> customerRequestPinChange(
            @RequestBody CustomerRequestPinChangeModel model){

        response = service.customerRequestPinChange(model);
        return response;
    }


}
