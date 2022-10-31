package com.javaAssignment.services.security;

import com.javaAssignment.repositories.security.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SecurityService {

    @Autowired
    SecurityRepository repository;

    public String customerRegistration(){
        String ss;
        ss = repository.customerRegistration(123,"","","");
        return ss;
    }

    public String customerLogin(){
        String ss;
        ss = repository.customerLogin("100100123","");
        return ss;
    }

    public String customerRequestPinChange(){
        String ss;
        ss = repository.customerRequestPinChange(123,"","","");
        return ss;
    }
}
