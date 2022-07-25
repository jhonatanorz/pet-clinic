package com.jhonatanorz.petclinic.pets.infraestructure.spring;

import com.jhonatanorz.petclinic.pets.domain.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpringDataJpaPetRepository extends CrudRepository<Pet, String> {

    List<Pet> findAll();

}
