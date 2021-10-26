package com.vip.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

// 设置最大存储
public class Demo01 {

    // 当存放的数量超过 maximumSize 时，最早的将被删除
    public static void main(String[] args) {
        Cache<Object, Object> cache = CacheBuilder
                .newBuilder()
                .maximumSize(2)
                .build();
        cache.put("name", "ryland");
        cache.put("age", 22);
        cache.put("gender", "male");

        System.out.println(cache.getIfPresent("name"));
        System.out.println(cache.getIfPresent("age"));
        System.out.println(cache.getIfPresent("gender"));
    }

}
