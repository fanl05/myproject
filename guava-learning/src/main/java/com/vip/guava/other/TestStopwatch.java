package com.vip.guava.other;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author Ryland
 */
public class TestStopwatch {

    public static void main(String[] args) {

        Stopwatch stopwatch = Stopwatch.createStarted();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stopwatch.elapsed());

    }

}
