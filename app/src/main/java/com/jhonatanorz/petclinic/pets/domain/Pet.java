package com.jhonatanorz.petclinic.pets.domain;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Pet extends Identifiable<String> {

    private String name;
    private LocalDateTime birthdate;
    private Specie specie;
    private Owner owner;

    public Pet(String id, String name, Specie specie, Owner owner) {
        this(id, name, null, specie, owner);
    }

    public Pet(String id, String name, LocalDateTime birthdate, Specie specie, Owner owner) {
        super(id);
        this.name = name;
        this.birthdate = birthdate;
        this.specie = specie;
        this.owner = owner;
    }
}
