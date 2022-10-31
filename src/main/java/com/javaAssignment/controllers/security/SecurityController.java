package com.javaAssignment.controllers.security;

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
    SecurityService service;

    Logger logger = LoggerFactory.getLogger(SecurityController.class);

    @PostMapping("/CustomerRegistration")
    public String customerRegistration(){

        String ss;
        ss = service.customerRegistration();
        logger.trace("customerRegistration");

        log.debug("Hello Benjamin");
        return ss;
    }

    @PostMapping("/CustomerLogin")
    public String customerLogin(){

        String ss;
        ss = service.customerLogin();
        return ss;
    }

    @PostMapping("/CustomerRequestPinChange")
    public String customerRequestPinChange(){

        String ss;
        ss = service.customerRequestPinChange();
        return ss;
    }
}
