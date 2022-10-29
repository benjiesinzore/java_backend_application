package com.javaAssignment.Repository;

import com.javaAssignment.Entity.ResEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestRepository extends JpaRepository<ResEntity, Integer> {




//    @Query(value = "CALL benjamiin(@resMes, :name)", nativeQuery = true)
//    String getGreetings(String name);

    @Procedure()
    String benjamiin(String valIn);


    @Procedure(name = "PostDataEntity.benjamiin", outputParameterName = "resMes")
    String getBenjamiin(@Param("valIn") String valIn);


    @Procedure(procedureName = "benjamiin")
    List<String> inAndOut(  @Param("valIn")
                      String valIn,

                    @Param("valIn2")
                    String valIn2

    );

}
