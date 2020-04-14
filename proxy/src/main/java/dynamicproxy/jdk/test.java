package dynamicproxy.jdk;

import java.lang.reflect.Proxy;

public class test {
    public static void main(String[] args) {
        Target target = new Target();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new MyInvocationHandle(target));
        proxy.query();
    }
}
