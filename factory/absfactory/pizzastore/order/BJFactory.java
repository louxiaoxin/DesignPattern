package DesignPattern.factory.absfactory.pizzastore.order;

import DesignPattern.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import DesignPattern.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import DesignPattern.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("Cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("北京奶酪披萨");
        } else if (pizzaType.equals("Pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }
}
