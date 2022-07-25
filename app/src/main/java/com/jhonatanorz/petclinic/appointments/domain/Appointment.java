package com.jhonatanorz.petclinic.appointments.domain;

import com.jhonatanorz.petclinic.shared.domain.Identifiable;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "appointments")
public class Appointment extends Identifiable<String> {

    @Temporal(value = TemporalType.DATE)
    private LocalDate date;

    @Column(name = "pet_id")
    private String petId;

    private String description;

    //orm specific
    protected Appointment() {
        super(null);
    }

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
