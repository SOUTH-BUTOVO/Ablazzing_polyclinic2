package com.javaacademy.Ablazzing_polyclinic2;

import com.javaacademy.Ablazzing_polyclinic2.config.DoctorSpecialization;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
public class Doctor {
    private final String specialization;
    private final BigDecimal rateAppointment;

    public Doctor(DoctorSpecialization spec) {
        this.specialization = spec.getSpecialization();
        this.rateAppointment = spec.getRate();
    }

    public BigDecimal healPeople() {
        log.info("{}, вылечил человека.", specialization);
        return rateAppointment;
    }
}
