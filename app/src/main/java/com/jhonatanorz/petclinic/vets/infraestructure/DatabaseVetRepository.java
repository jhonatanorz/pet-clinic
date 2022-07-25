package com.jhonatanorz.petclinic.vets.infraestructure;

import com.jhonatanorz.petclinic.vets.domain.Vet;
import com.jhonatanorz.petclinic.vets.domain.VetRepository;
import com.jhonatanorz.petclinic.vets.infraestructure.spring.SpringDataJpaVetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("default")
public class DatabaseVetRepository implements VetRepository {

    private final SpringDataJpaVetRepository repository;

    public DatabaseVetRepository(SpringDataJpaVetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vet find(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Vet> find() {
        return repository.findAll();
    }

    @Override
    public void save(Vet vet) {
        repository.save(vet);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
