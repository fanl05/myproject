package com.vip.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.ExecutionException;

// 自动加载
public class Demo06 {

    private static final Cache<String, String> cache = CacheBuilder
            .newBuilder()
            .maximumSize(3)
            .build();

    /**
     * Cache 的 get 方法有两个参数，第一个参数是要从 Cache 中获取记录的 key，第二个记录是一个 Callable 对象
     * 当缓存中已经存在 key 对应的记录时，get 方法直接返回 key 对应的记录
     * 如果缓存中不包含key对应的记录，Guava 会启动一个线程执行 Callable 对象中的 call 方法
     * call 方法的返回值会作为 key 对应的值被存储到缓存中，并且被 get 方法返回
     */
    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("thread1");
            try {
                String value = cache.get("key", () -> {
                    System.out.println("load1"); // 加载数据线程执行标志
                    Thread.sleep(1000); // 模拟加载时间
                    return "auto load by Callable 1";
                });
                System.out.println("thread1 " + value);
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            System.out.println("thread2");
            try {
                String value = cache.get("key", () -> {
                    System.out.println("load2"); // 加载数据线程执行标志
                    Thread.sleep(1000); // 模拟加载时间
                    return "auto load by Callable 2";
                });
                System.out.println("thread2 " + value);
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
