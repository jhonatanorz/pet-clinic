package com.jhonatanorz.petclinic.pets.application;

import com.jhonatanorz.petclinic.pets.domain.Specie;
import com.jhonatanorz.petclinic.pets.domain.SpecieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecieFinder {

    private final SpecieRepository repository;

    public SpecieFinder(SpecieRepository repository) {
        this.repository = repository;
    }

    public List<Specie> search() {
        return repository.find();
    }
}
