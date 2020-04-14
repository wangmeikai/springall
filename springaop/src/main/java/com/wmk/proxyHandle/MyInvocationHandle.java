package com.wmk.proxyHandle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class MyInvocationHandle implements InvocationHandler {
    private Object target;

    public MyInvocationHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object o = method.invoke(target, args);
        System.out.println("after");
        return o;
    }
}
