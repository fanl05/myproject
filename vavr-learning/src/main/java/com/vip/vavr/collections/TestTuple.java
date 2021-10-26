package com.vip.vavr.collections;

import io.vavr.Tuple;
import io.vavr.Tuple3;

import java.time.LocalDateTime;

/**
 * @author Ryland
 */
public class TestTuple {

    /**
     * tuple
     */
    public static void main(String[] args) {

        Tuple3<Integer, String, LocalDateTime> user = new Tuple3<>(1, "Ryland", LocalDateTime.of(1998, 12, 5, 0, 0));
        System.out.println(user);

    }

}
