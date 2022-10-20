package com.javaAssignment.Services;

import com.javaAssignment.Models.Cities;
import com.javaAssignment.Repositories.SecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecServises {

    @Autowired
    SecRepository secRepository;

    public  SecServises(){

    }

    public List<Cities> getCities(){
        return secRepository.findAll();
    }

    public Cities saveData(Cities cc){
        return secRepository.save(cc);
    }
}
