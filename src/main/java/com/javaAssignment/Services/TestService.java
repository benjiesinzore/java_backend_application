package com.javaAssignment.Services;

import com.javaAssignment.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;


@Transactional
@Service
public class TestService {

    @Autowired
    TestRepository repository;

    @Autowired
    EntityManager em;

    public TestService() {
    }

    public String getGreetings(){

        String ss, name = "Benjamin Sinzore";

        try {
            ss = repository.getGreetings(name);
        } catch (Exception ee){
            ss = ee.getMessage();
        }
        return ss;
    }


    public String newExec(){
        String ss;

        StoredProcedureQuery query = this.em.createStoredProcedureQuery("benjamiin");
        query.registerStoredProcedureParameter("resMes", String.class, ParameterMode.OUT);
        query.registerStoredProcedureParameter("valIn", String.class, ParameterMode.IN);
        query.setParameter("valIn", "Benjamin Sinzore");


        query.execute();
        ss = (String) query.getOutputParameterValue("resMes");

        return ss;
    }
}
