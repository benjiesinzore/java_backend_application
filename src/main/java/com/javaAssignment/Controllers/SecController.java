package com.javaAssignment.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("TestApi")
public class SecController {

    @GetMapping("greetings")
    public String greetings(){
        int num1 = 100, num2 = 300, res = num1 + num2;

        System.out.println("\n" + "          " + res);
        return "Hello Benjamin.";
    }
}
