package com.jhonatanorz.petclinic.vets.domain;

import com.jhonatanorz.petclinic.persons.domain.Person;
import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "vet_specialities",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id")
    )
    private Set<Speciality> specialities = new HashSet<>();

    //orm specific
    protected Vet() {
        super(null, null, null);
    }

    public Vet(String id, String name, String lastName) {
        super(id, name, lastName);
    }
}
