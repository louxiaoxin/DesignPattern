package DesignPattern.proxy.staticproxy;

/**
 * 1、优点：在不修改目标对象的功能前提下，能通过代理对象对目标功能扩展
 * 2、缺点：因为代理对象需要与目标对象实现一样的接口，所以会有很多代理类，一旦接口增加方法，目标对象与代理对象都要维护
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(iTeacherDao);
        teacherDaoProxy.teach();
    }
}
