package com.vip.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.vip.testeverything.User;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author Ryland
 */
public class CollectionTest {

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

    @Test
    public void test03() {
        List<User> users = Lists.newArrayList(User.builder().name("Ryland").build(),
                User.builder().name("Sherry").build());
        List<String> objects = Lists.newArrayList("Umbrella", "Phone");
        List<List<Object>> cartesianProductResult = Lists.cartesianProduct(users, objects);
        System.out.println("CartesianProductResult size: " + cartesianProductResult.size());
        cartesianProductResult.forEach(list -> System.out.println(((User) list.get(0)).getName() + "'s " + list.get(1)));
    }
}
