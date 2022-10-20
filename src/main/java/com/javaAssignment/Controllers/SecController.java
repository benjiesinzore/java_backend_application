package com.javaAssignment.Controllers;


import com.javaAssignment.Models.Cities;
import com.javaAssignment.Services.SecServises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("TestApi")
public class SecController {

    @Autowired
    SecServises secServises;

    @GetMapping("getCities")
    public List<Cities> getCities(){
        return secServises.getCities();
    }

    @PostMapping("saveData")
    public Cities saveData(@RequestBody Cities cc){
        return secServises.saveData(cc);
    }

    @GetMapping("greetings")
    public String greetings(){
        int num1 = 100, num2 = 300, res = num1 + num2;

        System.out.println("\n" + "          " + res);
        return "Hello Benjamin.";
    }
}
