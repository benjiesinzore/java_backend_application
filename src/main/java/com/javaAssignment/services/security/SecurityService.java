package com.javaAssignment.services.security;

import com.javaAssignment.models.requestbody.security.CustomerLoginModel;
import com.javaAssignment.models.requestbody.security.CustomerRegModel;
import com.javaAssignment.models.requestbody.security.CustomerRequestPinChangeModel;
import com.javaAssignment.models.responses.GlobalResponse;
import com.javaAssignment.repositories.security.SecurityRepository;
import org.apache.catalina.session.StandardSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.time.Duration;
import java.util.Enumeration;
import java.util.Objects;


@Transactional
@Service
public class SecurityService {

    @Autowired
    protected final SecurityRepository repository;

    SecurityService(SecurityRepository repository) {
        this.repository = repository;
    }

    Logger logger = LoggerFactory.getLogger(SecurityService.class);

    public ResponseEntity<GlobalResponse> customerRegistration(CustomerRegModel model){

        GlobalResponse response = new GlobalResponse();
        String password = model.getUserPassword();
        String conPassword = model.getConfirmPassword();
        if (Objects.equals(password, conPassword)){

            String res;
            try {
                res = repository.customerRegistration(
                        model.getUserID(),
                        model.getUserName(),
                        model.getUserPassword(),
                        model.getUserEmailAddress());

                response.setMessage(res);

                return new ResponseEntity<>(response, HttpStatus.OK);

            } catch (Exception ee){

                String error = ee.getMessage();
                logger.error(error);
                logger.info("Customer Registration Endpoint : Security Controller");
                response.setStatus(500);
                response.setError(error);
                response.setMessage("Internal Server Error.");

                return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);

            }
        } else {

            response.setStatus(400);
            response.setError("Bad request.");
            response.setMessage("Please ensure the passwords match.");

            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

        }

    }

    public ResponseEntity<GlobalResponse> customerLogin(CustomerLoginModel model){


        GlobalResponse response = new GlobalResponse();
        String res;
        try {
            res = repository.customerLogin(
                    model.getUserAccountNumber(),
                    model.getUserPassword());

            response.setMessage(res);

            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Customer Login Endpoint : Security Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

            return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);

        }

    }

    public ResponseEntity<GlobalResponse> customerRequestPinChange(
            CustomerRequestPinChangeModel model){

        GlobalResponse response = new GlobalResponse();
        String res;
        try {
            res = repository.customerRequestPinChange(
                    model.getUserAccountNumber(),
                    model.getUserName(),
                    model.getUserPassword(),
                    model.getRequestDate());

            response.setMessage(res);

            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception ee){
            String error = ee.getMessage();
            logger.error(error);
            logger.info("Customer Request PIN Change Endpoint : Security Controller");
            response.setStatus(500);
            response.setError(error);
            response.setMessage("Internal Server Error.");

            return new ResponseEntity<>(response, HttpStatus.REQUEST_TIMEOUT);

        }

    }

    public String setSession(){
        String ss = "Hello";


        try {
            HttpServletRequest request = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder
                    .getRequestAttributes())).getRequest();
//            HttpSession session = request.getSession(true);
//            session.setAttribute("Cry Love", "hell");
        } catch (Exception ee){
            ss = ee.getMessage();
        }

        return ss;
    }
}
