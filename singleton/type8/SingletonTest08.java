package DesignPattern.singleton.type8;

public class SingletonTest08{
    public static void main(String[] args) {
        Singleton.INSTANCE.sayHello();
    }
}

enum Singleton {
    INSTANCE;

    public void sayHello() {
        System.out.println("你好...");
    }
}
