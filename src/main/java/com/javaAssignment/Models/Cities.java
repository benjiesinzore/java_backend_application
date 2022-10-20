package com.javaAssignment.Models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "cities")
public class Cities {

    @Id
    @Column(name = "ID", nullable = false)
    int ID;

    @Column(name = "name", nullable = false)
    String name;

}
