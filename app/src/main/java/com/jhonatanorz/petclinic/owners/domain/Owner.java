package com.jhonatanorz.petclinic.owners.domain;

import com.jhonatanorz.petclinic.persons.domain.Person;
import com.jhonatanorz.petclinic.pets.domain.Pet;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
public class Owner extends Person {

    @Setter
    private Set<Pet> pets;

    public Owner(String id, String name, String lastName) {
        super(id, name, lastName);
    }
}
