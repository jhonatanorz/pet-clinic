package com.jhonatanorz.petclinic.pets.domain;

import net.andreinc.mockneat.MockNeat;

public class SpecieMother {

    public static Specie random() {

        MockNeat mock = MockNeat.threadLocal();

        return create(
                mock.uuids().get(),
                mock.names().get()
        );
    }

    public static Specie create(String id, String name) {
        return new Specie(id, name);
    }
}
