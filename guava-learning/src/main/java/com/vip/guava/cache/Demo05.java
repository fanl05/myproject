package com.vip.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.RemovalListener;

// 移除监听器
public class Demo05 {

    public static void main(String[] args) {
        RemovalListener<String, String> listener = notification -> System.out.println("[" + notification.getKey() + ":" + notification.getValue() + "] is removed!");
        Cache<String, String> cache = CacheBuilder
                .newBuilder()
                .maximumSize(3)
                .removalListener(listener)
                .build();
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");
        cache.put("key4", "value4");
        cache.put("key5", "value5");
        cache.put("key6", "value6");
        cache.put("key7", "value7");
        cache.put("key8", "value8");
    }

}
