package DesignPattern.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作北京胡椒披萨准备原材料");
    }
}
