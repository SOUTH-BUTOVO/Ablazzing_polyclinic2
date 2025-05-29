package com.javaacademy.Ablazzing_polyclinic2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AblazzingPolyclinic2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AblazzingPolyclinic2Application.class, args);
        Polyclinic polyclinic = context.getBean(Polyclinic.class);
        polyclinic.healthDentist();
        polyclinic.healthTherapist();
        polyclinic.healthSeniorSurgeon();
        polyclinic.healthJuniorSurgeon();

        context.close();
    }
}
