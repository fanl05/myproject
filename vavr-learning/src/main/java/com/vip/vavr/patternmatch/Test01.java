package com.vip.vavr.patternmatch;

import static io.vavr.API.*;

/**
 * @author Ryland
 */
public class Test01 {

    public static void main(String[] args) {

        System.out.println(match(1.88));

    }

    /**
     * pattern matching
     * @param height height
     */
    public static String match(double height) {

        return Match(height).of(
                Case($(h -> h < 1), () -> "< 1"),
                Case($(h -> h >= 1 && h < 1.5), () -> "1 ~ 1.5"),
                Case($(), () -> "> 1.5")
        );

    }

}
