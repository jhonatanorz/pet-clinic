package com.jhonatanorz.petclinic.shared.infraestructure;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import com.jhonatanorz.petclinic.shared.domain.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository<ID, T extends Identifiable<ID>> implements Repository<ID, T> {

    private final Map<ID, T> memory;

    protected InMemoryRepository() {
        this.memory = new HashMap<>();
    }

    @Override
    public T find(ID id) {
        return memory.get(id);
    }

    @Override
    public List<T> find() {
        return new ArrayList(memory.values());
    }

    @Override
    public void save(T entity) {
        memory.put(entity.getId(), entity);
    }

    @Override
    public void delete(ID id) {
        memory.remove(id);
    }
}
