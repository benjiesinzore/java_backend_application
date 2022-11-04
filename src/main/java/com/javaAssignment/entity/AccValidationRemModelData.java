package com.javaAssignment.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AccValidationRemModelData {

    @Id
    private int accountNumber;
    private String userName;
    private String userEmailAddress;

}
