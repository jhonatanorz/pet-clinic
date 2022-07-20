package com.jhonatanorz.petclinic.vets.domain;

import net.andreinc.mockneat.MockNeat;

public class SpecialityMother {

    public static Speciality random() {

        MockNeat mock = MockNeat.threadLocal();

        return create(
                mock.uuids().get(),
                mock.naughtyStrings().quotations().get()
        );

    }

    private static Speciality create(String id, String description) {
        return new Speciality(id, description);
    }

}
