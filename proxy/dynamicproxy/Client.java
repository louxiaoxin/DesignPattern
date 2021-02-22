package DesignPattern.proxy.dynamicproxy;

/**
 * 动态代理：
 *     代理对象不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
 *     代理对象的生成，是利用JDK的API，动态的在内存中构建代理对象
 *     动态代理也叫：JDK代理，接口代理
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(iTeacherDao).getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayHello("lxx");
    }
}
