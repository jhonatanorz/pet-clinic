package com.jhonatanorz.petclinic.owners.domain;

import com.jhonatanorz.petclinic.persons.domain.Person;
import lombok.Getter;

@Getter
public class Owner extends Person {

    public Owner(String id, String name, String lastName) {
        super(id, name, lastName);
    }
}
