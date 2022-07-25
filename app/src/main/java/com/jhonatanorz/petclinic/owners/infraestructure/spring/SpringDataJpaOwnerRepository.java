package com.jhonatanorz.petclinic.owners.infraestructure.spring;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpringDataJpaOwnerRepository extends CrudRepository<Owner, String> {

    List<Owner> findAll();

}
