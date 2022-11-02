package com.javaAssignment.controllers.security;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.services.security.SecurityService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/BankingTest")
public class SecurityController {

    @Autowired
    private final SecurityService service;
    public SecurityController(SecurityService service) {
        this.service = service;
    }
    private GlobalResponse response = new GlobalResponse();
    private final Logger logger = LoggerFactory.getLogger(SecurityController.class);


    @PostMapping("/CustomerRegistration")
    public GlobalResponse customerRegistration(){

        logger.trace("customerRegistration");
        logger.error("Hello Benjamin");
        response = service.customerRegistration();




        return response;
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
