package com.javaAssignment.models.responses.administration;

import com.javaAssignment.entity.AccValidationRemModelData;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AccValidationRemResp {
    String timestamp = new Date().toString();
    int status = 200;
    String error = "null";
    List<AccValidationRemModelData> data;
}

