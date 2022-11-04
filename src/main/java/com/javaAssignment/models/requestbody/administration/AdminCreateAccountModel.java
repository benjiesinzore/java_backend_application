package com.javaAssignment.models.requestbody.administration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Data
public class AdminCreateAccountModel {

    @NotBlank(message = "Employee ID is required.")
    int employeeID;
    @NotBlank(message = "Employee Password is required.")
    String employeeName;
    @NotBlank(message = "Employee Password is required.")
    String employeePassword;
    @NotBlank(message = "Employee Password is required.")
    String confirmPassword;
    @NotBlank(message = "Employee Password is required.")
    String employeeCapacity;
}
