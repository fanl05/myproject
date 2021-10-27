package com.vip.jdk8.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * @author Ryland
 */
public class TestFindFirst {

    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5);
        Optional<Integer> firstNumOptional = list.stream().findFirst();
        Integer integer = firstNumOptional.orElse(0);
        System.out.println("res: " + integer);
    }

}
