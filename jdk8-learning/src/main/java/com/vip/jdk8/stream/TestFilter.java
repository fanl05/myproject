package com.vip.jdk8.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ryland
 */
public class TestFilter {

    public static void main(String[] args) {

        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> res = list.stream().filter(num -> num > 2).collect(Collectors.toList());
        System.out.println("before: " + list);
        System.out.println("filtered: " + res);

    }

}
