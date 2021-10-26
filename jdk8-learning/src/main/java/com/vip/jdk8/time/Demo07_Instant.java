package com.vip.jdk8.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Ryland
 */
public class Demo07_Instant {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now.getEpochSecond()); // 秒
        System.out.println(now.toEpochMilli()); // 毫秒
        System.out.println(System.currentTimeMillis());

        Instant instant = Instant.ofEpochMilli(1634558531100L);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

    }

}
