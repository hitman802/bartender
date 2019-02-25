package com.honchar.bartender.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@Entity @Table(name = "cocktail_receipt")
public class CocktailReceipt {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String pathToPicture;

    @Column
    private String urlToVideo;

    @OneToMany @JoinColumn(name = "glass_type", referencedColumnName = "id")
    private List<GlassType> glassType;

    @OneToMany @JoinColumn(name = "ingredient", referencedColumnName = "id")
    private List<Ingredient> ingredients;
}
