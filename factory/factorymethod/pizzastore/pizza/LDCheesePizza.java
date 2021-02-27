package DesignPattern.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作伦敦奶酪披萨准备原材料");
    }
}
