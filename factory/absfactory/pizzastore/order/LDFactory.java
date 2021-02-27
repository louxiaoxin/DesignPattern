package DesignPattern.factory.absfactory.pizzastore.order;

import DesignPattern.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import DesignPattern.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import DesignPattern.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("Cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("伦敦奶酪披萨");
        } else if (pizzaType.equals("Pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("伦敦胡椒披萨");
        }
        return pizza;
    }
}
