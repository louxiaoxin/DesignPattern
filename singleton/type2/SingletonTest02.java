package DesignPattern.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{
    private Singleton() {

    }

    private final static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
