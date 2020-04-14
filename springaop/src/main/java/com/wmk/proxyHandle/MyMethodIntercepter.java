package com.wmk.proxyHandle;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class MyMethodIntercepter implements MethodInterceptor {

    private Object target;

    //发挥代理对象
    public Object newProxyInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理");
//        System.out.println(method.getName());
        /**
         * 如果使用invokeSuper，用proxy对象
         * 如果使用invoke，用target对象
         * 如果用代理对象调用invoke，会出现死循环栈溢出
         * //Object value = methodProxy.invoke(this.target, objects);
         * //Object value = methodProxy.invokeSuper(o, objects);
         */
//        Object value = methodProxy.invoke(this.target, objects);
        Object value = methodProxy.invokeSuper(o, objects);
        return value;
    }
}
