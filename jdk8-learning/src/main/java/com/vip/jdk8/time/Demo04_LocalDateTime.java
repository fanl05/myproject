package com.vip.jdk8.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author Ryland
 */
public class Demo04_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        LocalDateTime end = LocalDateTime.of(2020, 1, 9, 19, 25, 30);
        Duration d = Duration.between(start, end);
        System.out.println(d); // PT1235H10M30S
        System.out.println(d.getSeconds() / 60 / 60 / 24);
        Duration d1 = Duration.ofHours(10); // 10 hours
        Duration d2 = Duration.parse("P1DT2H3M"); // 1 day, 2 hours, 3 minutes
        Duration d3 = Duration.parse("PT26H3M"); // 1 day, 2 hours, 3 minutes
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);

        System.out.println("==========================================");

        Period p = LocalDate.of(2019, 11, 19).until(LocalDate.of(2020, 1, 9));
        System.out.println(p); // P1M21D
        System.out.println(p.getYears() + ":" + p.getMonths() + ":" + p.getDays());
        System.out.println(p.get(ChronoUnit.DAYS));

    }

}
