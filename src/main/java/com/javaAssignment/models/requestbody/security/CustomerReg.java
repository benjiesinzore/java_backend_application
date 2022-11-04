package com.javaAssignment.models.requestbody.security;

//import com.tericcabrel.hotel.models.Address;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Pattern.Flag;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Data
public class CustomerReg {

    int userID;
    @NotBlank(message = "User name is required.")
    String userName;
    String userEmailAddress;
    String userPassword;
    String confirmPassword;

    public CustomerReg(int userID, String userName, String userEmailAddress, String userPassword, String confirmPassword) {
        this.userID = userID;
        this.userName = userName;
        this.userEmailAddress = userEmailAddress;
        this.userPassword = userPassword;
        this.confirmPassword = confirmPassword;
    }
}


