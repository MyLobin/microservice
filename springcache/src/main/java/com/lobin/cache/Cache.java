package com.lobin.cache;

import java.util.concurrent.Callable;

public interface Cache {
    String getName();
    Object getNativeCache();
    ValueWrapper get(Object key);
    <T> T get(Object key,Class<T> type);
    <T> T get(Object key,Callable<T> valueLoader);
    void put(Object key,Object value,int expire);
    ValueWrapper putIfAbsent(Object key,Object value);
    void evict(Object key);
    void clear();

    @FunctionalInterface
    interface ValueWrapper{
        Object get();
    }

    class ValueRetrievalException extends RuntimeException{
        private final Object key;
        public ValueRetrievalException(Object key,Callable<?> loader,Throwable ex){
            super(String.format("Value for key '%s' could not be loaded using '%s'",key,loader),ex);
            this.key=key;
        }
        public Object getKey(){
            return this.key;
        }
    }
}
