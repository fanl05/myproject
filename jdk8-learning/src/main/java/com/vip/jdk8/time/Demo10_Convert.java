package com.vip.jdk8.time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author Ryland
 */
public class Demo10_Convert {

    /**
     * 数据库	    对应Java类（旧）	    对应Java类（新）
     * DATETIME	    java.util.Date	    LocalDateTime
     * DATE	        java.sql.Date	    LocalDate
     * TIME	        java.sql.Time	    LocalTime
     * TIMESTAMP	java.sql.Timestamp	LocalDateTime
     */
    public static void main(String[] args) {
        long ts = 1574208900000L;
        System.out.println(timestampToString(ts, Locale.CHINA, "Asia/Shanghai"));
        System.out.println(timestampToString(ts, Locale.US, "America/New_York"));
    }

    static String timestampToString(long epochMilli, Locale lo, String zoneId) {
        Instant ins = Instant.ofEpochMilli(epochMilli);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT);
        return f.withLocale(lo).format(ZonedDateTime.ofInstant(ins, ZoneId.of(zoneId)));
    }

}
