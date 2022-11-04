package com.javaAssignment.models.requestbody.administration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Data
public class ValidateCustomerAccModel {

    @NotBlank(message = "Customer Account Number is required.")
    int accountNumber;
}
