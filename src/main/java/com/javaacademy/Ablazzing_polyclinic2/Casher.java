package com.javaacademy.Ablazzing_polyclinic2;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Касса
 */
@Slf4j
@ToString
@Component
public class Casher {
    private BigDecimal profit = BigDecimal.ZERO;

    public void payment(BigDecimal payment) {
        profit = profit.add(payment);
        log.info("Принят платеж в размере: {}", payment);
    }

    public void prtProfit() {
        log.info("Доход поликлиники: {}", profit);
    }
}
