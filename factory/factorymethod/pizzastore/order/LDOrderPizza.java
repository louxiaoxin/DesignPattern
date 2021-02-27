package DesignPattern.factory.factorymethod.pizzastore.order;

import DesignPattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import DesignPattern.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import DesignPattern.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
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
