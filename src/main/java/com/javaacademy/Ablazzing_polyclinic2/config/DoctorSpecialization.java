package com.javaacademy.Ablazzing_polyclinic2.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum DoctorSpecialization {
    DENTIST("Дантист", BigDecimal.valueOf(1_500)),
    THERAPIST("Терапевт", BigDecimal.valueOf(500)),
    SENIOR_SURGEON("Хирург", BigDecimal.valueOf(2_000)),
    JUNIOR_SURGEON("Хирург", BigDecimal.valueOf(700));

    private final String specialization;
    private final BigDecimal rate;
}
