package com.jhonatanorz.petclinic.owners.infraestructure;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.owners.domain.OwnerRepository;
import com.jhonatanorz.petclinic.shared.infraestructure.InMemoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryOwnerRepository extends InMemoryRepository<String, Owner> implements OwnerRepository {
}
