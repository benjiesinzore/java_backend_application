package com.javaAssignment.models.requestbody.security;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@Data
public class CustomerRequestPinChange {

    @NotBlank(message = "User Account Number is required.")
    int userAccountNumber;
    @NotBlank(message = "User Name Number is required.")
    String userName;
    @NotBlank(message = "User Password is required.")
    String userPassword;
    String requestDate = new Date().toString();
}
