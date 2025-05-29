package com.javaacademy.Ablazzing_polyclinic2.doctor;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Getter
public class Doctor {
    private final String specialization;
    private final BigDecimal rateAppointment;

    public Doctor(DoctorSpecialization spec, BigDecimal rateAppointment) {
        this.specialization = spec.getSpecialization();
        this.rateAppointment = rateAppointment;
    }

    public BigDecimal healPeople() {
        log.info("{}, вылечил человека.", specialization);
        return rateAppointment;
    }
}
