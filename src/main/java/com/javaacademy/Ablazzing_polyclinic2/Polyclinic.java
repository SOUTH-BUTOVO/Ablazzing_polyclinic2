package com.javaacademy.Ablazzing_polyclinic2;

import com.javaacademy.Ablazzing_polyclinic2.config.DoctorProperties;
import com.javaacademy.Ablazzing_polyclinic2.doctor.Doctor;
import com.javaacademy.Ablazzing_polyclinic2.doctor.DoctorSpecialization;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static com.javaacademy.Ablazzing_polyclinic2.doctor.DoctorSpecialization.*;

@Slf4j
@Component
@AllArgsConstructor
public class Polyclinic {
    private Casher casher;
    private DoctorProperties doctor;
    private List<Doctor> specialists;

    public void healthDentist() {
        health(DENTIST, doctor.getDentist());
    }

    public void healthTherapist() {
        health(THERAPIST, doctor.getTherapist());
    }

    public void healthJuniorSurgeon() {
        health(JUNIOR_SURGEON, doctor.getJuniorSurgeon());
    }

    public void healthSeniorSurgeon() {
        health(SENIOR_SURGEON, doctor.getSeniorSurgeon());
    }

    private void health(DoctorSpecialization doctorSpecialization, BigDecimal rate) {
        specialists.stream()
                .filter(doc ->
                        doc.getSpecialization().equals(doctorSpecialization.getSpecialization()) &&
                        doc.getRateAppointment().equals(rate))
                .forEach(doctor -> {
                    BigDecimal payment = doctor.healPeople();
                    casher.payment(payment);
                });
    }
}
