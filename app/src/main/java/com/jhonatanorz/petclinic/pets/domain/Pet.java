package com.jhonatanorz.petclinic.pets.domain;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Pet extends Identifiable<String> {

    private String name;
    private LocalDateTime birthdate;
    private Specie type;
    private Owner owner;

    public Pet(String id, String name, Owner owner) {
        this(id, name, null, null, owner);
    }

    public Pet(String id, String name, LocalDateTime birthdate, Specie type, Owner owner) {
        super(id);
        this.name = name;
        this.birthdate = birthdate;
        this.type = type;
        this.owner = owner;
    }
}
