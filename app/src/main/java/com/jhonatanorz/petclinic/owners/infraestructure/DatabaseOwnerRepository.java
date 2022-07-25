package com.jhonatanorz.petclinic.owners.infraestructure;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.owners.domain.OwnerRepository;
import com.jhonatanorz.petclinic.owners.infraestructure.spring.SpringDataJpaOwnerRepository;

import java.util.List;

public class DatabaseOwnerRepository implements OwnerRepository {

    private SpringDataJpaOwnerRepository repository;

    public DatabaseOwnerRepository(SpringDataJpaOwnerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Owner find(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Owner> find() {
        return repository.findAll();
    }

    @Override
    public void save(Owner owner) {
        repository.save(owner);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
