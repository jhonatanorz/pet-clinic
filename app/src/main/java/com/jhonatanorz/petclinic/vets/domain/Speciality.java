package com.jhonatanorz.petclinic.vets.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

@Getter
public class Speciality extends Identifiable<String> {

    private String description;

    public Speciality(String id, String description) {
        super(id);
        this.description = description;
    }
}
