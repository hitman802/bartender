package com.honchar.bartender.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter @Getter
@Entity
@Table(name = "ingredient_type")
public class IngredientType {

    @Column @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String type;
}