package com.javaAssignment.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "cities")
@Entity
public class CityEntity {
    @Id
    int ID;

    String name;
}
