package com.javaAssignment.Services;

import com.javaAssignment.Entities.CityEntity;
import com.javaAssignment.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesServices {

    @Autowired
    CityRepository repository;

    public CitiesServices(){}

    public List<CityEntity> getCities(){
        return repository.findAll();
    }
}
