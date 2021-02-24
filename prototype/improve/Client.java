package DesignPattern.prototype.improve;

/**
 * cloneable接口是浅拷贝，对象中的成员变量是对象时只进行引用传递
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
