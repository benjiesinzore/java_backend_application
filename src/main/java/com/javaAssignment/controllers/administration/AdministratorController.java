package com.javaAssignment.controllers.administration;

import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/BankingTest")
public class AdministratorController {

    @Autowired
    AdministratorService service;

    @PostMapping("/AdminCreateAccount")
    public String adminCreateAccount(){

        return "ss";
    }

    @PostMapping("/AdminLogin")
    public String adminLogin(){

        return "ss";
    }

    @PostMapping("/ValidateCustomerAccount")
    public String validateCustomerAccount(){

        return "ss";
    }

    @PostMapping("/BlockCustomerAccount")
    public String blockCustomerAccount(){

        return "ss";
    }

    @PostMapping("/FreezeCustomerSavings")
    public String freezeCustomerSavings(){

        return "ss";
    }

    @PostMapping("/ValidateLoan")
    public String validateLoan(){

        return "ss";
    }
}
