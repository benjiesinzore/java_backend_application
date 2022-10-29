package com.javaAssignment.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class ResEntity {

    @Id
    String resMes;
}
