package com.jhonatanorz.petclinic.owners.application;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.owners.domain.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerFinder {

    private final OwnerRepository repository;

    public OwnerFinder(OwnerRepository repository) {
        this.repository = repository;
    }

    public List<Owner> search() {
        return repository.find();
    }

}
