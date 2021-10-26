package com.vip.guava.cache;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

// LoadingCache
public class Demo08 {

    /**
     * LoadingCache 是 Cache 的子接口，相比较于 Cache，当从 LoadingCache 中读取一个指定 key 的记录时
     * 如果该记录不存在，则 LoadingCache 可以自动执行加载数据到缓存的操作
     */
    private static final CacheLoader<String, String> LOADER = new CacheLoader<String, String>() {
        @Override
        public String load(String key) throws Exception {
            Thread.sleep(1000); // 休眠 1s，模拟加载数据
            System.out.println(key + " is loaded from a cacheLoader!");
            return key + "'s value";
        }
    };

    public static void main(String[] args) throws ExecutionException {

        LoadingCache<String, String> loadingCache = CacheBuilder
                .newBuilder()
                .maximumSize(3)
                .build(LOADER); // 在构建时指定自动加载器

        loadingCache.get("key1");
        loadingCache.get("key2");
        loadingCache.get("key3");
    }

}
