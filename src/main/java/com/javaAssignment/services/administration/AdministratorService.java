package com.javaAssignment.services.administration;

import com.javaAssignment.repositories.administration.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service
public class AdministratorService {

    @Autowired
    AdministratorRepository repository;
}