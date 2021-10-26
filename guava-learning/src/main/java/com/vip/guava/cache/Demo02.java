package com.vip.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

// 设置过期时间
public class Demo02 {

    public static void main(String[] args) {
        Cache<Object, Object> cache = CacheBuilder
                .newBuilder()
                .expireAfterWrite(5, TimeUnit.SECONDS) // 写入 5 秒后删除
                .expireAfterAccess(5, TimeUnit.SECONDS) // 5 秒没有被访问到则删除
                .build();
        cache.put("name", "ryland");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cache.getIfPresent("name"));
    }

}
