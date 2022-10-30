package com.javaAssignment.controllers.testContrller;

import com.javaAssignment.services.testService.TestService;
import com.javaAssignment.entity.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController()
@RequestMapping("JavaBackend")
public class SecurityControllerTest {

    @Autowired
    TestService testService;


    @GetMapping("getHelloBenjie")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getHelloBenjie(){
        List<String> ss = new ArrayList<>();
        MyEntity model = new MyEntity();

        ss = testService.getGreetings();
//        model.setResMes();
        return ss;
    }

}
