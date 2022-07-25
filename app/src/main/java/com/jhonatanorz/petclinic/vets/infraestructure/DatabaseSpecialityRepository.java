package com.jhonatanorz.petclinic.vets.infraestructure;

import com.jhonatanorz.petclinic.vets.domain.Speciality;
import com.jhonatanorz.petclinic.vets.domain.SpecialityRepository;
import com.jhonatanorz.petclinic.vets.infraestructure.spring.SpringDataJpaSpecialityRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("default")
public class DatabaseSpecialityRepository implements SpecialityRepository {

    private final SpringDataJpaSpecialityRepository repository;

    public DatabaseSpecialityRepository(SpringDataJpaSpecialityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Speciality find(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Speciality> find() {
        return repository.findAll();
    }

    @Override
    public void save(Speciality speciality) {
        repository.save(speciality);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
