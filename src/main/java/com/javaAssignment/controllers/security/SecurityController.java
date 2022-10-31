package com.javaAssignment.controllers.security;

import com.javaAssignment.services.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/BankingTest")
public class SecurityController {

    @Autowired
    SecurityService service;

    @PostMapping("/CustomerRegistration")
    public String customerRegistration(){

        String ss;
        ss = service.customerRegistration();
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
