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
public class CustomerRegModel {

    @NotBlank(message = "User ID is required.")
    int userID;
    @NotBlank(message = "User name is required.")
    String userName;
    @NotBlank(message = "User email address is required.")
    String userEmailAddress;
    @NotBlank(message = "User password is required.")
    String userPassword;
    @NotBlank(message = "User confirmation password is required.")
    String confirmPassword;

}

