package com.jhonatanorz.petclinic.pets.infraestructure;

import com.jhonatanorz.petclinic.pets.domain.Specie;
import com.jhonatanorz.petclinic.pets.domain.SpecieRepository;
import com.jhonatanorz.petclinic.shared.infraestructure.InMemoryRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("memory")
public class InMemorySpecieRepository extends InMemoryRepository<String, Specie> implements SpecieRepository {
}
