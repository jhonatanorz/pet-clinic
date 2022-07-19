package com.jhonatanorz.petclinic.persons.domain;

import lombok.Getter;

@Getter
public class Person {

    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

}
