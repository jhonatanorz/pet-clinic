package com.jhonatanorz.petclinic.vets.domain;

import net.andreinc.mockneat.MockNeat;

public class VetMother {

    public static Vet random() {

        MockNeat mock = MockNeat.threadLocal();

        return create(
                mock.uuids().get(),
                mock.names().first().get(),
                mock.names().last().get()
        );
    }

    private static Vet create(String id, String name, String lastName) {
        return new Vet(id, name, lastName);
    }
}
