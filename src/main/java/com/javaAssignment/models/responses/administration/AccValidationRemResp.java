package com.javaAssignment.models.responses.administration;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class AccValidationRemResp {
    String timestamp = new Date().toString();
    int status = 200;
    String error = "null";
    AccValidationRemModel model;
}

