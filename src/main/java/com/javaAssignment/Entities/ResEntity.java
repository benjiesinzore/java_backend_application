package com.javaAssignment.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class ResEntity {

    @Id
    int ID;
    String resMes;
}
