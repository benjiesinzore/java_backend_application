package com.javaAssignment.models.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AccValidationRemResp {
    String timestamp = new Date().toString();
    int status = 200;
    String error = "null";
    public T data = new T();
}

class T {
    int accountNumber;
    String userName;
    String userEmailAddress;
}
