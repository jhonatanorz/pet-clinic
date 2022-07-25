package com.jhonatanorz.petclinic.vets.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "specialities")
public class Speciality extends Identifiable<String> {

    private String description;

    //orm specific
    protected Speciality() {
        super(null);
    }

    public Speciality(String id, String description) {
        super(id);
        this.description = description;
    }
}
