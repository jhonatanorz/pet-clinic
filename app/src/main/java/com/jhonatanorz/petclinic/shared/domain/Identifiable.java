package com.jhonatanorz.petclinic.shared.domain;

import lombok.Getter;

@Getter
public abstract class Identifiable<ID> {

    public final ID id;

    protected Identifiable(ID id) {
        this.id = id;
    }
}
