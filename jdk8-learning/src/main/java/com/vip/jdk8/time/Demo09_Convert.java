package com.vip.jdk8.time;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Ryland
 */
public class Demo09_Convert {

    /**
     * 新 api 转老 api
     */
    public static void main(String[] args) {

        // ZonedDateTime -> long:
        ZonedDateTime zdt = ZonedDateTime.now();
        long ts = zdt.toEpochSecond() * 1000;

        // long -> Date:
        Date date = new Date(ts);

        // long -> Calendar:
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeZone(TimeZone.getTimeZone(zdt.getZone().getId()));
        calendar.setTimeInMillis(zdt.toEpochSecond() * 1000);

    }

}
