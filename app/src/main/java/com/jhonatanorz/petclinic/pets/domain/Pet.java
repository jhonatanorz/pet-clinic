package com.jhonatanorz.petclinic.pets.domain;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "pets")
public class Pet extends Identifiable<String> {

    private String name;

    @Temporal(value = TemporalType.DATE)
    private LocalDateTime birthdate;

    @OneToOne
    @JoinColumn(name = "specie_id")
    private Specie specie;

    @ManyToOne
    @JoinColumn(name = "owner_iid")
    private Owner owner;

    //orm specific
    protected Pet() {
        super(null);
    }

    public Pet(String id, String name, Specie specie, Owner owner) {
        this(id, name, null, specie, owner);
    }

    public Pet(String id, String name, LocalDateTime birthdate, Specie specie, Owner owner) {
        super(id);
        this.name = name;
        this.birthdate = birthdate;
        this.specie = specie;
        this.owner = owner;
    }
}
