package com.vip.guava.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

// 弱引用
public class Demo03 {

    /**
     * 可以通过 weakKeys 和 weakValues 方法指定 Cache 只保存对缓存记录 key 和 value 的弱引用
     * 这样当没有其他强引用指向 key 和 value 时，key 和 value 对象就会被垃圾回收器回收
     */
    public static void main(String[] args) {
        Cache<Object, Object> cache = CacheBuilder
                .newBuilder()
                .weakValues()
                .build();
        Object obj = new Object();
        cache.put("obj", obj);
        obj = new Object();
        System.gc();
        System.out.println(cache.getIfPresent("obj"));

    }

}
