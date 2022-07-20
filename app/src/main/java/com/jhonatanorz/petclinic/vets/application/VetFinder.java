package com.jhonatanorz.petclinic.vets.application;

import com.jhonatanorz.petclinic.vets.domain.Vet;
import com.jhonatanorz.petclinic.vets.domain.VetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetFinder {

    private final VetRepository repository;

    public VetFinder(VetRepository repository) {
        this.repository = repository;
    }

    public List<Vet> search() {
        return repository.find();
    }
}
