package DesignPattern.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(iTeacherDao).getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayHello("lxx");
    }
}
