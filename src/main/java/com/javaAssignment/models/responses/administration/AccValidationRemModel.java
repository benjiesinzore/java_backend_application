package com.javaAssignment.models.responses.administration;

import lombok.*;
import org.hibernate.annotations.NamedNativeQuery;

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
@NamedNativeQuery(name="AccValidationRemModel.getTestSqlMapping",
        query="    SELECT\n" +
                "    \n" +
                "    accountNumber,\n" +
                "\tuserName,\n" +
                "\tuserEmailAddress \n" +
                "    \n" +
                "    FROM t_CustomerRegistrationDetails WHERE status = 'Pending Approval'; ",
        resultSetMapping="myMapping",
        resultClass = AccValidationRemModelData.class)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AccValidationRemModel {

    @Column(name = "accountNumber")
    @Id
    public int accountNumber;
    @Column(name = "userName")
    public String userName;
    @Column(name = "userEmailAddress")
    public String userEmailAddress;


}
