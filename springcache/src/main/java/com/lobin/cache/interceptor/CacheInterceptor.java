package com.lobin.cache.interceptor;

import com.lobin.cache.annotation.CacheTest;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;

public class CacheInterceptor implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        if(method.isAnnotationPresent(CacheTest.class)){
            System.out.println("methodInterceptor");
            return methodInvocation.proceed();
        }
        return null;
    }
}
