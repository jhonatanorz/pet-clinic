package com.jhonatanorz.petclinic.owners.domain;

import com.jhonatanorz.petclinic.persons.domain.Person;
import com.jhonatanorz.petclinic.pets.domain.Pet;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Setter
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    //orm specific
    protected Owner() {
        super(null, null, null);
    }

    public Owner(String id, String name, String lastName) {
        super(id, name, lastName);
    }
}
