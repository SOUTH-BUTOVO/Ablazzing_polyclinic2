package com.javaacademy.Ablazzing_polyclinic2;

import com.javaacademy.Ablazzing_polyclinic2.config.DoctorSpecialization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Component
public class Polyclinic {
    private Casher casher;
    private List<Doctor> specialists;

    public Polyclinic(Casher casher, List<Doctor> specialists) {
        this.casher = casher;
        this.specialists = specialists;
    }

    public void healthDentist() {
        specialists.stream()
                .filter(doctor ->
                        doctor.getSpecialization().equals(DoctorSpecialization.DENTIST.getSpecialization()) &&
                                doctor.getRateAppointment().equals(DoctorSpecialization.DENTIST.getRate()))
                .map(Doctor::healPeople)
                .forEach(casher::payment);
    }

    public void healthTherapist() {
        specialists.stream()
                .filter(doctor ->
                        doctor.getSpecialization().equals(DoctorSpecialization.THERAPIST.getSpecialization()) &&
                                doctor.getRateAppointment().equals(DoctorSpecialization.THERAPIST.getRate()))
                .map(Doctor::healPeople)
                .forEach(casher::payment);
    }

    public void healthSeniorSurgeon() {
        specialists.stream()
                .filter(doctor ->
                        doctor.getSpecialization().equals(DoctorSpecialization.SENIOR_SURGEON.getSpecialization()) &&
                                doctor.getRateAppointment().equals(DoctorSpecialization.SENIOR_SURGEON.getRate()))
                .map(Doctor::healPeople)
                .forEach(casher::payment);
    }

    public void healthJuniorSurgeon() {
        specialists.stream()
                .filter(doctor ->
                        doctor.getSpecialization().equals(DoctorSpecialization.JUNIOR_SURGEON.getSpecialization()) &&
                                doctor.getRateAppointment().equals(DoctorSpecialization.JUNIOR_SURGEON.getRate()))
                .forEach(doctor -> {
                    BigDecimal payment = doctor.healPeople();
                    casher.payment(payment);
                });
    }
}
