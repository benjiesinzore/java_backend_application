package com.javaAssignment.controllers.administration;

import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/BankingTest")
public class AdministratorController {

    @Autowired
    AdministratorService service;

    @PostMapping("/AdminCreateAccount")
    public String adminCreateAccount(){

        String ss;
        ss = service.adminCreateAccount();

        return ss;
    }


    @RequestMapping(value = "/AdminLogin", method = RequestMethod.POST)
    public String adminLogin(){

        String ss;
        ss = service.adminLogin();

        return ss;
    }


    @PostMapping("/CustomerAccValidationReminder")
    public List<String> customerAccValidationReminder(){

        List<String> ss = new ArrayList<>();
        ss = service.accValidationReminder();
        return ss;
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
