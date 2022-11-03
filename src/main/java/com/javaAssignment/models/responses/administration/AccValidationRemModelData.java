package com.javaAssignment.models.responses.administration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AccValidationRemModelData {

    @Id
    private int accountNumber;
    private String userName;
    private String userEmailAddress;
}
