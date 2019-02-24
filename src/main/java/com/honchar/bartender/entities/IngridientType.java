package com.honchar.bartender.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IngridientType {
    @Setter @Getter @Id
    private long id;

    @Setter @Getter
    private String type;
}