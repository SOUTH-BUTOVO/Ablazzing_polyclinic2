package com.javaacademy.Ablazzing_polyclinic2.config;

import com.javaacademy.Ablazzing_polyclinic2.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.javaacademy.Ablazzing_polyclinic2.doctor.DoctorSpecialization.*;

@Configuration
@EnableConfigurationProperties(DoctorProperties.class)
public class DoctorConfiguration {
    @Autowired
    private DoctorProperties properties;

    @Bean
    public Doctor dentist() {
        return new Doctor(DENTIST, properties.getDentist());
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(JUNIOR_SURGEON, properties.getJuniorSurgeon());
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(SENIOR_SURGEON, properties.getSeniorSurgeon());
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(THERAPIST, properties.getTherapist());
    }
}
