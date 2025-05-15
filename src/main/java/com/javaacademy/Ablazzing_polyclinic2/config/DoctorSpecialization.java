package com.javaacademy.Ablazzing_polyclinic2.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
@AllArgsConstructor
public enum DoctorSpecialization {
    DENTIST("Дантист", BigDecimal.valueOf(1_500)),
    THERAPIST("Терапевт", BigDecimal.valueOf(500)),
    SENIOR_SURGEON("Хирург", BigDecimal.valueOf(2_000)),
    JUNIOR_SURGEON("Хирург", BigDecimal.valueOf(700));

    final String specialization;
    final BigDecimal rate;
}
