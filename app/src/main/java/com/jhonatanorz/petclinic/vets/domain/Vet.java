package com.jhonatanorz.petclinic.vets.domain;

import com.jhonatanorz.petclinic.persons.domain.Person;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Vet(String id, String name, String lastName) {
        super(id, name, lastName);
    }
}
