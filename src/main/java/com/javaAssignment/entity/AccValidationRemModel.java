package com.javaAssignment.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigInteger;

@SqlResultSetMapping(
        name="myMapping",
        classes={
                @ConstructorResult(
                        targetClass=AccValidationRemModelData.class,
                        columns={
                                @ColumnResult(name="accountNumber", type = BigInteger.class),
                                @ColumnResult(name="userName", type = String.class),
                                @ColumnResult(name="userEmailAddress", type = String.class),
                        }
                )
        }
)
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "accountValidationReinder", resultSetMappings = "myMapping",
                procedureName = "sp_CustomerValidationReminder")
})
//@NamedNativeQuery(name="AccValidationRemModel.getTestSqlMapping",
//        query="    SELECT\n" +
//                "    \n" +
//                "    accountNumber,\n" +
//                "\tuserName,\n" +
//                "\tuserEmailAddress \n" +
//                "    \n" +
//                "    FROM t_CustomerRegistrationDetails WHERE status = 'Pending Approval'; ",
//        resultSetMapping="myMapping",
//        resultClass = AccValidationRemModelData.class)
@Entity
@Getter
@Setter
public class AccValidationRemModel {

    @Id
    public BigInteger accountNumber;
    public String userName;
    public String userEmailAddress;

}
