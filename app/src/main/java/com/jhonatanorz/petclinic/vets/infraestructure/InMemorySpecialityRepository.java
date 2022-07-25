package com.jhonatanorz.petclinic.vets.infraestructure;

import com.jhonatanorz.petclinic.shared.infraestructure.InMemoryRepository;
import com.jhonatanorz.petclinic.vets.domain.Speciality;
import com.jhonatanorz.petclinic.vets.domain.SpecialityRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("memory")
public class InMemorySpecialityRepository extends InMemoryRepository<String, Speciality> implements SpecialityRepository {
}
