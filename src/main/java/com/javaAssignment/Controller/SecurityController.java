package com.javaAssignment.Controller;

import com.javaAssignment.Entity.ResEntity;
import com.javaAssignment.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController()
@RequestMapping("JavaBackend")
public class SecurityController {

    @Autowired
    TestService testService;


    @GetMapping("getHelloBenjie")
    public List<String> getGreetings(){
        List<String> ss = new ArrayList<>();
        ResEntity model = new ResEntity();

        ss = testService.getGreetings();
//        model.setResMes();
        return ss;
    }

}
