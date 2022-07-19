package com.jhonatanorz.petclinic.pets;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Pet {

    private String name;
    private LocalDateTime birthdate;
    private Specie type;
    private Owner owner;

    public Pet(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public Pet(String name, LocalDateTime birthdate, Specie type, Owner owner) {
        this.name = name;
        this.birthdate = birthdate;
        this.type = type;
        this.owner = owner;
    }
}
