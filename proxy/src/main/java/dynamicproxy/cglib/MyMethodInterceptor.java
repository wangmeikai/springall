package dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {

    private Target target;

    public MyMethodInterceptor(Target target) {
        this.target = target;
    }

    /**
     * @param o  表示代理对象
     * @param method  表示目标类中的方法
     * @param objects  表示方法参数
     * @param methodProxy  表示代理方法的MethodProxy对象
     * @return  代理后方法的返回值
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务管理");
        Object invoke = method.invoke(target, objects);
        return invoke;
    }
}
