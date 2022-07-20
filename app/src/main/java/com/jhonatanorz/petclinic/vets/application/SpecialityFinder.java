package com.jhonatanorz.petclinic.vets.application;

import com.jhonatanorz.petclinic.vets.domain.Speciality;
import com.jhonatanorz.petclinic.vets.domain.SpecialityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityFinder {

    private final SpecialityRepository repository;

    public SpecialityFinder(SpecialityRepository repository) {
        this.repository = repository;
    }

    public List<Speciality> search() {
        return repository.find();
    }
}
