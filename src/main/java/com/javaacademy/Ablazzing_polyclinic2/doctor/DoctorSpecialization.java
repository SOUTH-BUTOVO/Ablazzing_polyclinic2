package com.javaacademy.Ablazzing_polyclinic2.doctor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DoctorSpecialization {
    DENTIST("Дантист"),
    THERAPIST("Терапевт"),
    SENIOR_SURGEON("Хирург"),
    JUNIOR_SURGEON("Хирург");

    private final String specialization;
}
