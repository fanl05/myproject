package com.vip.guava.funtion;

import com.google.common.base.Function;

import javax.annotation.CheckForNull;

/**
 * @author Ryland
 */
public class Test01 {

    public static void main(String[] args) {

        Function<String, Integer> func = s -> s == null ? 0 : s.length();
        Integer length1 = func.apply("Ryland");
        System.out.println("length: " + length1);
        Integer length2 = func.apply(null);
        System.out.println("length: " + length2);

    }

}
