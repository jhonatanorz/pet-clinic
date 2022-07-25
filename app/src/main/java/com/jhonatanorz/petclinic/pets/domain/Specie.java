package com.jhonatanorz.petclinic.pets.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "species")
public class Specie extends Identifiable<String> {

    private String name;

    //orm specific
    protected Specie() {
        super(null);
    }

    public Specie(String id, String name) {
        super(id);
        this.name = name;
    }
}
