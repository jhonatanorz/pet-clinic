package com.jhonatanorz.petclinic.appointments.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Appointment extends Identifiable<String> {

    private LocalDate date;
    private String petId;
    private String description;

    public Appointment(String id, LocalDate date, String petId) {
        this(id, date, petId, null);
    }

    public Appointment(String id, LocalDate date, String petId, String description) {
        super(id);
        this.date = date;
        this.petId = petId;
        this.description = description;
    }
}
