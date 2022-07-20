package com.jhonatanorz.petclinic.vets.application;

import com.jhonatanorz.petclinic.vets.domain.Vet;
import com.jhonatanorz.petclinic.vets.domain.VetMother;
import com.jhonatanorz.petclinic.vets.domain.VetRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class VetFinderTest {

    private VetRepository repository;
    private VetFinder finder;

    @BeforeEach
    void setUp() {

        repository = mock(VetRepository.class);
        finder = new VetFinder(repository);
    }

    @Test
    void should_find_existent_vets() {

        List<Vet> existentVets = Arrays.asList(VetMother.random(), VetMother.random());

        when(repository.find())
                .thenReturn(existentVets);

        assertEquals(existentVets, finder.search());

    }
}