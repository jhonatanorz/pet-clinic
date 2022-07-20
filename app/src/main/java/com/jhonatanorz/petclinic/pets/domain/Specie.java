package com.jhonatanorz.petclinic.pets.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

@Getter
public class Specie extends Identifiable<String> {

    private String name;

    public Specie(String id, String name) {
        super(id);
        this.name = name;
    }
}
