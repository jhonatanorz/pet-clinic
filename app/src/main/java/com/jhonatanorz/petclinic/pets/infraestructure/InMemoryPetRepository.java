package com.jhonatanorz.petclinic.pets.infraestructure;

import com.jhonatanorz.petclinic.pets.domain.Pet;
import com.jhonatanorz.petclinic.pets.domain.PetRepository;
import com.jhonatanorz.petclinic.shared.infraestructure.InMemoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryPetRepository extends InMemoryRepository<String, Pet> implements PetRepository {
}
