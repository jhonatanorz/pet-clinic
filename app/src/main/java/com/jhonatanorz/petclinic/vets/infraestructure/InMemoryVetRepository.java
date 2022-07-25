package com.jhonatanorz.petclinic.vets.infraestructure;

import com.jhonatanorz.petclinic.shared.infraestructure.InMemoryRepository;
import com.jhonatanorz.petclinic.vets.domain.Vet;
import com.jhonatanorz.petclinic.vets.domain.VetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("memory")
public class InMemoryVetRepository extends InMemoryRepository<String, Vet> implements VetRepository {
}
