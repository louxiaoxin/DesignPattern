package DesignPattern.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(iTeacherDao);
        teacherDaoProxy.teach();
    }
}
