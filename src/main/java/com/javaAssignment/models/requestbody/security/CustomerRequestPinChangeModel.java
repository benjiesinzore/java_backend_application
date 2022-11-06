package com.javaAssignment.models.requestbody.security;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class CustomerRequestPinChangeModel {

    int userAccountNumber;
    String userName;
    String userPassword;
    String userNewPassword;
    String userConfirmNewPassword;
    String requestDate = new Date().toString();
}
