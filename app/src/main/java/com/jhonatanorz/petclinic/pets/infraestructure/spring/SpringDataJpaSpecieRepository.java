package com.jhonatanorz.petclinic.pets.infraestructure.spring;

import com.jhonatanorz.petclinic.pets.domain.Specie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpringDataJpaSpecieRepository extends CrudRepository<Specie, String> {

    List<Specie> findAll();
}
