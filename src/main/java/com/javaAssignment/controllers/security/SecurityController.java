package com.javaAssignment.controllers.security;

import com.javaAssignment.models.requestbody.security.CustomerReg;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.services.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController()
@RequestMapping("/BankingTest")
public class SecurityController {

    @Autowired
    private final SecurityService service;
    public SecurityController(SecurityService service) {
        this.service = service;
    }
    private GlobalResponse response = new GlobalResponse();

    @PostMapping("/CustomerRegistration")
    public ResponseEntity<GlobalResponse> customerRegistration(@RequestBody CustomerReg model){

        response = service.customerRegistration(model);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/CustomerLogin")
    public GlobalResponse customerLogin(){

        response = service.customerLogin();
        return response;
    }

    @PostMapping("/CustomerRequestPinChange")
    public GlobalResponse customerRequestPinChange(){

        response = service.customerRequestPinChange();
        return response;
    }

}
