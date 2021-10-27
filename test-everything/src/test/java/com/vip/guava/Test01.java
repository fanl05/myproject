package com.vip.guava;

import com.vip.testeverything.User;
import org.junit.Test;

/**
 * @author Ryland
 */
public class Test01 {

    @Test
    public void test01(){
        User user = User.builder().name("Ryland").age(22).build();
        System.out.println(user);
    }

}
