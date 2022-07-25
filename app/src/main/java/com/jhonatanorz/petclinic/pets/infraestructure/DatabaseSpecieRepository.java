package com.jhonatanorz.petclinic.pets.infraestructure;

import com.jhonatanorz.petclinic.pets.domain.Specie;
import com.jhonatanorz.petclinic.pets.domain.SpecieRepository;
import com.jhonatanorz.petclinic.pets.infraestructure.spring.SpringDataJpaSpecieRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("default")
public class DatabaseSpecieRepository implements SpecieRepository {

    private final SpringDataJpaSpecieRepository repository;

    public DatabaseSpecieRepository(SpringDataJpaSpecieRepository repository) {
        this.repository = repository;
    }

    @Override
    public Specie find(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Specie> find() {
        return repository.findAll();
    }

    @Override
    public void save(Specie specie) {
        repository.save(specie);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
