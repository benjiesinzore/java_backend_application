package com.javaAssignment.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AccValidationRemModelData {

    @Id
    private BigInteger accountNumber;
    private String userName;
    private String userEmailAddress;

}
