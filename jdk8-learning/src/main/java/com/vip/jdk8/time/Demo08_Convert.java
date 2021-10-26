package com.vip.jdk8.time;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Ryland
 */
public class Demo08_Convert {

    /**
     * 老 api 转新 api
     */
    public static void main(String[] args) {

        // Date -> Instant:
        Instant ins1 = new Date().toInstant();
        System.out.println(ins1);

        // Calendar -> Instant -> ZonedDateTime:
        Calendar calendar = Calendar.getInstance();
        Instant ins2 = calendar.toInstant();
        ZonedDateTime zdt = ins2.atZone(calendar.getTimeZone().toZoneId());
        System.out.println(zdt);

    }

}
