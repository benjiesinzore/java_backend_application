package com.javaAssignment.services.testService;

import com.javaAssignment.repositories.testRepository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;


@Transactional
@Service
public class TestService {

    @Autowired
    TestRepository repository;

    @Autowired
    EntityManager em;

    public TestService() {
    }

    public List<String> getGreetings(){

        List<String> ss = new ArrayList<>();

        String name = "Benjamin Sinzore";

        try {
            ss = repository.inAndOut(name, name);
        } catch (Exception ee){
            //
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
