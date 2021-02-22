package DesignPattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (proxy, method, args) -> {
                //proxy对象可将其返回以连续调用
                    System.out.println("jdk代理开始");
                    Object returnObj = method.invoke(target, args);
                    System.out.println("jdk代理结束");
                    return proxy;
                });
    }
}
