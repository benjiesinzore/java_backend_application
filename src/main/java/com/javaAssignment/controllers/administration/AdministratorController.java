package com.javaAssignment.controllers.administration;

import com.javaAssignment.services.administration.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("BankingTest")
public class AdministratorController {

    @Autowired
    AdministratorService service;
}
