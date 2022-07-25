package com.jhonatanorz.petclinic.vets.infraestructure.spring;

import com.jhonatanorz.petclinic.vets.domain.Speciality;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SpringDataJpaSpecialityRepository extends CrudRepository<Speciality, String> {

    List<Speciality> findAll();

}
