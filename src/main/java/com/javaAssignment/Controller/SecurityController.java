package com.javaAssignment.Controller;

import com.javaAssignment.Entities.CityEntity;
import com.javaAssignment.Services.CitiesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("JavaBackend")
public class SecurityController {

    @Autowired
    CitiesServices services;

    @GetMapping("getCities")
    public List<CityEntity> getCities(){
        List<CityEntity> list = new ArrayList<>();

        list = services.getCities();
        return list;
    }
}
