package com.vip.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author Ryland
 */
public class Test01 {

    @Test
    public void test01() {
        Set<Integer> set = Sets.newHashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }

    @Test
    public void test02() {
        List<String> list = Lists.asList("1", "2", new String[]{"3"});
        System.out.println(list);
    }

}
