package com.jhonatanorz.petclinic.persons.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

@Getter
public class Person extends Identifiable<String> {

    private String name;
    private String lastName;

    public Person(String id, String name, String lastName) {
        super(id);
        this.name = name;
        this.lastName = lastName;
    }

}
