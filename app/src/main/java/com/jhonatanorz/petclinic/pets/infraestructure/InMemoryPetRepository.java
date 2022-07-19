package com.jhonatanorz.petclinic.pets.infraestructure;

import com.jhonatanorz.petclinic.pets.domain.Pet;
import com.jhonatanorz.petclinic.shared.infraestructure.InMemoryRepository;

public class InMemoryPetRepository extends InMemoryRepository<String, Pet> {
}
