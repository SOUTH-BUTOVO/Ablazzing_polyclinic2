package com.javaacademy.Ablazzing_polyclinic2.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@Getter
@Setter
@ConfigurationProperties(prefix = "doctor.rates")
public class DoctorProperties {
    private BigDecimal dentist;
    private BigDecimal therapist;
    private BigDecimal juniorSurgeon;
    private BigDecimal seniorSurgeon;
}
