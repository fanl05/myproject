package com.vip.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.ArrayList;
import java.util.List;

// 显示清除
public class Demo04 {

    public static void main(String[] args) throws InterruptedException {
        Cache<String,String> cache = CacheBuilder.newBuilder().build();
        Object value = new Object();
        cache.put("key1","value1");
        cache.put("key2","value2");
        cache.put("key3","value3");

        List<String> list = new ArrayList<>();
        list.add("key1");
        list.add("key2");

        cache.invalidateAll(list); // 批量清除 list 中全部 key 对应的记录
        System.out.println(cache.getIfPresent("key1"));
        System.out.println(cache.getIfPresent("key2"));
        System.out.println(cache.getIfPresent("key3"));
    }

}
