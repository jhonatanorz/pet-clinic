package com.jhonatanorz.petclinic.shared.domain;

import lombok.Getter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@MappedSuperclass
public abstract class Identifiable<ID extends Serializable> {

    @Id
    public final ID id;

    protected Identifiable(ID id) {
        this.id = id;
    }
}
