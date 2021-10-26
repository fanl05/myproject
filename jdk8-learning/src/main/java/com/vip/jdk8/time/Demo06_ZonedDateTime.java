package com.vip.jdk8.time;

import java.time.*;

/**
 * @author Ryland
 */
public class Demo06_ZonedDateTime {

    /**
     * 某航线从北京飞到纽约需要13小时20分钟，请根据北京起飞日期和时间计算到达纽约的当地日期和时间
     * china 2019/9/15 13:00:00 usa 2019/9/15 01:00:00 + 13h20m = 2019/9/15 14:20:00
     * TODO 正确答案未知
     */
    public static void main(String[] args) {

        myCal();

    }

    public static void myCal() {
        LocalDateTime departureAtBeijing = LocalDateTime.of(2019, 9, 15, 13, 0, 0);
        Instant instant = departureAtBeijing.plusHours(13).plusMinutes(20).toInstant(ZoneOffset.UTC);
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("America/New_York"));
        int year = zonedDateTime.getYear();
        int month = zonedDateTime.getMonth().getValue();
        int day = zonedDateTime.getDayOfMonth();
        int hour = zonedDateTime.getHour();
        int minute = zonedDateTime.getMinute();
        int second = zonedDateTime.getSecond();
        System.out.println(year + ":" + month + ":" + day + " " + hour + ":" + minute + ":" + second);
    }

}
