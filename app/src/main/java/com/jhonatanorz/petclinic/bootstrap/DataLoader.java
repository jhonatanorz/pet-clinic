package com.jhonatanorz.petclinic.bootstrap;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.owners.domain.OwnerRepository;
import com.jhonatanorz.petclinic.vets.domain.Vet;
import com.jhonatanorz.petclinic.vets.domain.VetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetRepository vetRepository;
    private final OwnerRepository ownerRepository;

    public DataLoader(VetRepository vetRepository, OwnerRepository ownerRepository) {
        this.vetRepository = vetRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner john = new Owner(
                UUID.randomUUID().toString(),
                "John",
                "Doe"
        );
        ownerRepository.save(john);

        Owner sam = new Owner(
                UUID.randomUUID().toString(),
                "Sam",
                "Axe"
        );
        ownerRepository.save(sam);

        System.out.println("Owners loaded...");

        Vet ana = new Vet(
                UUID.randomUUID().toString(),
                "Ana",
                "Doe"
        );
        vetRepository.save(ana);

        Vet michael = new Vet(
                UUID.randomUUID().toString(),
                "Michael",
                "Weston"
        );
        vetRepository.save(michael);

        System.out.println("Vets loaded...");

    }

}
