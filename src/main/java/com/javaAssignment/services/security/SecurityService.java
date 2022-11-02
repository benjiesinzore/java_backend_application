package com.javaAssignment.services.security;

import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.repositories.security.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SecurityService {

    @Autowired
    private final SecurityRepository repository;
    private final GlobalResponse response = new GlobalResponse();

    public SecurityService(SecurityRepository repository) {
        this.repository = repository;
    }

    public GlobalResponse customerRegistration(){
        String res;

        try {
            res = repository.customerRegistration(123,"","","");
            response.setMessage(res);
        } catch (Exception ee){
            response.setStatus(500);
            response.setError(ee.getMessage());
            response.setMessage("Internal Server Error.");
        }

        return response;
    }

    public GlobalResponse customerLogin(){
        String res;
        try {
            res = repository.customerLogin("100100123","");
            response.setMessage(res);
        } catch (Exception ee){
            response.setStatus(500);
            response.setError(ee.getMessage());
            response.setMessage("Internal Server Error.");
        }

        return response;
    }

    public GlobalResponse customerRequestPinChange(){
        String res;
        try {
            res = repository.customerRequestPinChange(123,"","",
                    "");
            response.setMessage(res);
        } catch (Exception ee){
            response.setStatus(500);
            response.setError(ee.getMessage());
            response.setMessage("Internal Server Error.");
        }

        return response;
    }
}
