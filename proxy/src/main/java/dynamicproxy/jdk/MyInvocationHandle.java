package dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler {
    private TargetInterface target;

    public MyInvocationHandle(TargetInterface target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("创建事务");
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
