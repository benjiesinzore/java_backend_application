package com.javaAssignment.models.requestbody.transactions;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Data
@Getter
@Setter
public class CheckAvailableBalanceModel {

    BigInteger accountNumber;
    String userPassword;

}
