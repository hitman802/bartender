package com.honchar.bartender.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter @Setter
@Table(name = "ingredient")
public class Ingredient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "ingredient_type_id", referencedColumnName = "id")
    private IngredientType ingredientType;
}
