package com.honchar.bartender.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CoctailReceipt {
    @Getter @Setter @Id
    private long id;
}
