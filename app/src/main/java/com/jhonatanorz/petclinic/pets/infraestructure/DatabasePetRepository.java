package com.jhonatanorz.petclinic.pets.infraestructure;

import com.jhonatanorz.petclinic.pets.domain.Pet;
import com.jhonatanorz.petclinic.pets.domain.PetRepository;
import com.jhonatanorz.petclinic.pets.infraestructure.spring.SpringDataJpaPetRepository;

import java.util.List;

public class DatabasePetRepository implements PetRepository {

    private final SpringDataJpaPetRepository repository;

    public DatabasePetRepository(SpringDataJpaPetRepository repository) {
        this.repository = repository;
    }

    @Override
    public Pet find(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Pet> find() {
        return repository.findAll();
    }

    @Override
    public void save(Pet pet) {
        repository.save(pet);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
