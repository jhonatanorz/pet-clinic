package com.jhonatanorz.petclinic.pets.application;

import com.jhonatanorz.petclinic.pets.domain.Specie;
import com.jhonatanorz.petclinic.pets.domain.SpecieMother;
import com.jhonatanorz.petclinic.pets.domain.SpecieRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SpecieFinderTest {

    private SpecieFinder finder;
    private SpecieRepository repository;

    @BeforeEach
    void setUp() {
        repository = mock(SpecieRepository.class);
        finder = new SpecieFinder(repository);
    }

    @Test
    void should_find_existent_species() {

        List<Specie> savedSpecies = Arrays.asList(SpecieMother.random(), SpecieMother.random());

        when(repository.find())
                .thenReturn(savedSpecies);

        assertEquals(savedSpecies, finder.search());

    }
}