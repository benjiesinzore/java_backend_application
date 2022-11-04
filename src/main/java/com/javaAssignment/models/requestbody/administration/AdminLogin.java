package com.javaAssignment.models.requestbody.administration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@Data
public class AdminLogin {

    @NotBlank(message = "Employee ID is required.")
    int employeeID;
    @NotBlank(message = "Employee Password is required.")
    String employeePassword;
}