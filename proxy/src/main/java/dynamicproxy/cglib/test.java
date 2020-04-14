package dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new MyMethodInterceptor(new Target()));
        Target proxy = (Target) enhancer.create();
        proxy.query("dlj");
    }
}
