package com.jhonatanorz.petclinic.owners.domain;

import net.andreinc.mockneat.MockNeat;

public class OwnerMother {

    public static Owner random() {
        MockNeat mock = MockNeat.threadLocal();

        return create(
                mock.uuids().get(),
                mock.names().get(),
                mock.names().last().get()
        );
    }

    public static Owner create(String id, String name, String lastName) {
        return new Owner(id, name, lastName);
    }

}
