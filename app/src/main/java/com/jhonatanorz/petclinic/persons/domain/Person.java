package com.jhonatanorz.petclinic.persons.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@MappedSuperclass
public class Person extends Identifiable<String> {

    private String name;

    @Column(name = "last_name")
    private String lastName;

    public Person(String id, String name, String lastName) {
        super(id);
        this.name = name;
        this.lastName = lastName;
    }

}
