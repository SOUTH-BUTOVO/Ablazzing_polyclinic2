package com.javaacademy.Ablazzing_polyclinic2.config;

import com.javaacademy.Ablazzing_polyclinic2.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.javaacademy.Ablazzing_polyclinic2.config.DoctorSpecialization.*;

@Configuration
public class DoctorConfiguration {

    @Bean
    public Doctor dentist() {
        return new Doctor(DENTIST);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(SENIOR_SURGEON);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(JUNIOR_SURGEON);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(THERAPIST);
    }
}
