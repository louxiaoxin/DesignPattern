package DesignPattern.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao iTeacherDao;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("准备授课。。。");
        iTeacherDao.teach();;
        System.out.println("授课结束。。。");
    }
}
