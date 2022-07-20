package com.jhonatanorz.petclinic.owners.application;

import com.jhonatanorz.petclinic.owners.domain.Owner;
import com.jhonatanorz.petclinic.owners.domain.OwnerMother;
import com.jhonatanorz.petclinic.owners.domain.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OwnerFinderTest {

    private OwnerRepository repository;
    private OwnerFinder finder;

    @BeforeEach
    void setUp() {
        repository = mock(OwnerRepository.class);
        finder = new OwnerFinder(repository);
    }

    @Test
    void should_find_existent_owners() {

        List<Owner> existentOwners = Arrays.asList(OwnerMother.random(), OwnerMother.random());

        when(repository.find())
                .thenReturn(existentOwners);

        assertEquals(existentOwners, finder.search());

    }

}