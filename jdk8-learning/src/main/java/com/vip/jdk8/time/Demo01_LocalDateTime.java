package com.vip.jdk8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Ryland
 */
public class Demo01_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime birthday = LocalDateTime.of(2021, 12, 5, 0, 0, 0);
        System.out.println(birthday);

        String timeStr1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss"));
        String timeStr2 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss", Locale.CHINA));
        System.out.println("yyyy:MM:dd HH:mm:ss " + timeStr1);
        System.out.println("yyyy:MM:dd HH:mm:ss " + timeStr2);

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalTime: " + localTime);

        LocalDateTime timeParsed = LocalDateTime.parse("2019-11-19T15:16:17");
        System.out.println("timeParsed: " + timeParsed);

        LocalDateTime timeCalc = timeParsed.plusYears(2).plusMonths(1).minusDays(14);
        System.out.println(timeCalc);

        LocalDateTime timeCalc2 = timeParsed.withYear(2021).withMonth(12).withDayOfMonth(5);
        System.out.println(timeCalc2);

    }

}
