package com.vip.juc;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Ryland
 */
public class ThreadLocalTest {

    private final ThreadLocal<User> USER_THREAD_LOCAL = new ThreadLocal<>();

    public static void main(String[] args) {
        User user = new User("a");
        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        threadLocalTest.processUser(user);
    }

    public void processUser(User user) {
        try {
            USER_THREAD_LOCAL.set(user);
            step1();
            step2();
        } finally {
            USER_THREAD_LOCAL.remove();
        }

    }

    private void step1() {
        User user = USER_THREAD_LOCAL.get();
        System.out.println("step1: " + user);
    }

    private void step2() {
        User user = USER_THREAD_LOCAL.get();
        System.out.println("step2: " + user);
    }

}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
