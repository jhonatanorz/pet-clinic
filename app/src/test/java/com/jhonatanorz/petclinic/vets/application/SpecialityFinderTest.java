package com.jhonatanorz.petclinic.vets.application;

import com.jhonatanorz.petclinic.vets.domain.Speciality;
import com.jhonatanorz.petclinic.vets.domain.SpecialityMother;
import com.jhonatanorz.petclinic.vets.domain.SpecialityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SpecialityFinderTest {

    private SpecialityFinder finder;
    private SpecialityRepository repository;

    @BeforeEach
    void setUp() {
        repository = mock(SpecialityRepository.class);
        finder = new SpecialityFinder(repository);
    }

    @Test
    void should_find_existent_specialities() {

        List<Speciality> specialities = Arrays.asList(SpecialityMother.random(), SpecialityMother.random());

        when(repository.find())
                .thenReturn(specialities);

        assertEquals(specialities, finder.search());
    }
}