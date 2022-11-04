package com.javaAssignment.models.requestbody.security;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Data
public class CustomerLoginModel {

    @NotBlank(message = "User Account Number is required.")
    int userAccountNumber;
    @NotBlank(message = "User password is required.")
    String userPassword;

    public CustomerLoginModel(int userAccountNumber, String userPassword) {
        this.userAccountNumber = userAccountNumber;
        this.userPassword = userPassword;
    }
}
