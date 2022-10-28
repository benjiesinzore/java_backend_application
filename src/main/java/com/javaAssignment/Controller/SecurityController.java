package com.javaAssignment.Controller;

import com.javaAssignment.Entities.ResEntity;
import com.javaAssignment.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("JavaBackend")
public class SecurityController {

    @Autowired
    TestService testService;


    @GetMapping("getHelloBenjie")
    public ResEntity getGreetings(){
        ResEntity model = new ResEntity();
        model.setResMes(testService.getGreetings());
        return model;
    }

}
