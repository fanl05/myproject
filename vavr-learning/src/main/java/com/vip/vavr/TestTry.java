package com.vip.vavr;

import io.vavr.control.Try;

/**
 * @author Ryland
 */
public class TestTry {

    /**
     * try
     */
    public static void main(String[] args) {
        Try<Integer> res1 = divide(1, 1);
        Try<Integer> res2 = divide(2, 0);
        System.out.println("res1: " + (res1.isFailure() ? res1.getCause() : res1.get()));
        System.out.println("res2: " + (res2.isFailure() ? res2.getCause() : res2.get()));
    }

    private static Try<Integer> divide(Integer dividend, Integer divisor) {
        return Try.of(() -> dividend / divisor);
    }

}
