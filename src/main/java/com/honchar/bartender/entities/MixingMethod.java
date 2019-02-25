package com.honchar.bartender.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "mixing_method")
public class MixingMethod {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String method;

    @Column
    private String description;

}
