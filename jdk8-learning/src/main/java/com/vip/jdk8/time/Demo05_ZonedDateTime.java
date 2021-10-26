package com.vip.jdk8.time;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Ryland
 */
public class Demo05_ZonedDateTime {

    public static void main(String[] args) {

        ZonedDateTime time1 = ZonedDateTime.now(); // 默认时区
        ZonedDateTime time2 = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
        ZonedDateTime time3 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai")); // 用指定时区获取当前时间
        System.out.println("now: " + time1);
        System.out.println("America/New_York: " + time2);
        System.out.println("Asia/Shanghai: " + time3);

        ZonedDateTime timeConverted = time3.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("America/New_York: " + timeConverted);

        LocalTime localTime = timeConverted.toLocalTime();
        System.out.println("LocalTime: " + localTime);

    }

}
