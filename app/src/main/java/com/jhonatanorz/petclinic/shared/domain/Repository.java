package com.jhonatanorz.petclinic.shared.domain;

import java.util.List;

public interface Repository<ID, T> {

    T find(ID id);

    List<T> find();

    void save(T entity);

    void delete(ID id);

}
