package com.javaAssignment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class MyEntity {

    @Id
    int id;
}
