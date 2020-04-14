package com.wmk.postprocessor;

import com.wmk.proxyHandle.MyMethodIntercepter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor_Aop implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("s")){
            //JDK代理
//            Class<?>[] interfaces = bean.getClass().getInterfaces();
//            return Proxy.newProxyInstance(MyBeanPostProcessor_AopTest.class.getClassLoader(),
//                    interfaces,new MyInvocationHandle(bean));
            //cglib代理
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(bean.getClass());
//            enhancer.setCallback(new MyMethodIntercepter());
            Object o = new MyMethodIntercepter().newProxyInstance(bean);
            return o;
        }
        return bean;
    }
}
