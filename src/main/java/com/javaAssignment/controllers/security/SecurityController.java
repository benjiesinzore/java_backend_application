package com.javaAssignment.controllers.security;

import com.javaAssignment.models.requestbody.security.CustomerLogin;
import com.javaAssignment.models.requestbody.security.CustomerReg;
import com.javaAssignment.models.requestbody.security.CustomerRequestPinChange;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.services.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController()
@RequestMapping(value = "/BankingTest")
public class SecurityController {

    @Autowired
    private final SecurityService service;
    public SecurityController(SecurityService service) {
        this.service = service;
    }
    private GlobalResponse response = new GlobalResponse();

    @PostMapping(value = "/CustomerRegistration")
    public ResponseEntity<GlobalResponse> customerRegistration(@RequestBody CustomerReg model){

        response = service.customerRegistration(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/CustomerLogin")
    public ResponseEntity<GlobalResponse> customerLogin(@RequestBody CustomerLogin model){

        response = service.customerLogin(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/CustomerRequestPinChange")
    public ResponseEntity<GlobalResponse> customerRequestPinChange(@RequestBody CustomerRequestPinChange model){

        response = service.customerRequestPinChange(model);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
