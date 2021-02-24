package DesignPattern.bridge;

/**
 * 桥接模式替代多层继承方案，可以减少子类个数，降低系统的管理和维护成本
 * 桥接模式应用场景：
 *     JDBC驱动程序
 *     银行转账系统：
 *         转账分类：网上转账、柜台转账、ATM转账
 *         转账用户类型：普通用户、银卡用户、金卡用户
 *     消息管理：
 *         消息类型：即时消息、延时消息
 *         消息分类：手机短信、邮件消息、QQ消息
 */
public class Client {
    public static void main(String[] args) {
        Brand brand = new XiaoMi();
        Phone phone = new FoldedPhone(brand);
        phone.open();
        Phone phone1 = new UpRightPhone(brand);
        phone1.open();
    }
}
