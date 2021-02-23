package DesignPattern.singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{
    private Singleton() {

    }

    private final static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

}
