package com.javaAssignment.models.responses.administration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccValidationRemModelData {

    private int accountNumber;
    private String userName;
    private String userEmailAddress;
}
