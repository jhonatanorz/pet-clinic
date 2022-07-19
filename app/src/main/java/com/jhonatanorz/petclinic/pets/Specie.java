package com.jhonatanorz.petclinic.pets;

import lombok.Getter;

@Getter
public class Specie {

    private String name;

    public Specie(String name) {
        this.name = name;
    }
}
