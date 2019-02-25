package com.honchar.bartender.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "glass_type")
public class GlassType {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String type;

    @Column(name = "path_to_picture")
    private String pathToPicture;

}
