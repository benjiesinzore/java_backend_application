package com.javaAssignment.models.responses.administration;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NamedNativeQuery;

import javax.persistence.*;


@SqlResultSetMapping(
        name="myMapping",
        classes={
                @ConstructorResult(
                        targetClass=AccValidationRemModel.class,
                        columns={
                                @ColumnResult(name="accountNumber"),
                                @ColumnResult(name="userName"),
                                @ColumnResult(name="userEmailAddress"),
                        }
                )
        }
)
@NamedStoredProcedureQuery(name="sp_CustomerValidationReminder",
        procedureName = "sp_CustomerValidationReminder",resultSetMappings = "myMapping"
                )
@Entity
public class AccValidationRemModel {

    public AccValidationRemModel() {
    }

    public AccValidationRemModel(int accountNumber, String userName, String userEmailAddress) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.userEmailAddress = userEmailAddress;
    }

//    @Column(name = "accountNumber")
    @Id
    public int accountNumber;
//    @Column(name = "userName")
    public String userName;
//    @Column(name = "userEmailAddress")
    public String userEmailAddress;

}
