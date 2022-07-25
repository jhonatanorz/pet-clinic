package com.jhonatanorz.petclinic.bootstrap;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.owners.domain.OwnerRepository;
import com.jhonatanorz.petclinic.vets.domain.Vet;
import com.jhonatanorz.petclinic.vets.domain.VetRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
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

        log.info("Owners loaded...");

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

        log.info("Vets loaded...");

    }

}
