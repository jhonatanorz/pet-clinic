package com.jhonatanorz.petclinic.vets.infraestructure.spring;

import com.jhonatanorz.petclinic.vets.domain.Vet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpringDataJpaVetRepository extends CrudRepository<Vet, String> {

    List<Vet> findAll();

}
