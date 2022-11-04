package com.javaAssignment.models.requestbody.administration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.query.Param;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Data
public class BlockCustomerAccountModel {


    @NotBlank(message = "Customer Account Number is required.")
    String accountNumber;
    @NotBlank(message = "Reason for is required.")
    String reasonForBlock;
    @NotBlank(message = "Date initiated is required.")
    String dateInitiated;
    @NotBlank(message = "Blocked by field is required required.")
    String blockedBy;
}
