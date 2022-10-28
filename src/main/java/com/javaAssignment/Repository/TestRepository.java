package com.javaAssignment.Repository;

import com.javaAssignment.Entities.ResEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends JpaRepository<ResEntity, String> {


//    @Query(value = "CALL benjamiin(@resMes, :name)", nativeQuery = true)
//    String getGreetings(String name);

    @Procedure(procedureName = "benjamiin")
    String getGreetings(String valIn);

}
