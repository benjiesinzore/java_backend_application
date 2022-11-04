package com.javaAssignment.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@SqlResultSetMapping(
        name="myMapping",
        classes={
                @ConstructorResult(
                        targetClass=AccValidationRemModelData.class,
                        columns={
                                @ColumnResult(name="accountNumber", type = Integer.class),
                                @ColumnResult(name="userName", type = String.class),
                                @ColumnResult(name="userEmailAddress", type = String.class),
                        }
                )
        }
)
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getTestSqlMapping", resultSetMappings = "myMapping",
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
    public int accountNumber;
    public String userName;
    public String userEmailAddress;

}
