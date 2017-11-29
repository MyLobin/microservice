package com.lobin.cache.interceptor;

import com.lobin.cache.Cache;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.SimpleCacheErrorHandler;
import org.springframework.util.Assert;

public abstract class AbstractCacheInvoker {
    private CacheErrorHandler errorHandler;
    protected AbstractCacheInvoker(){this(new SimpleCacheErrorHandler());}
    protected AbstractCacheInvoker(CacheErrorHandler errorHandler){
        Assert.notNull(errorHandler,"errorHandler cannot be null");
        this.errorHandler=errorHandler;
    }

    public CacheErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public void setErrorHandler(CacheErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    protected Cache.ValueWrapper doGet(Cache cache,Object key){
        return cache.get(key);
    }

}
