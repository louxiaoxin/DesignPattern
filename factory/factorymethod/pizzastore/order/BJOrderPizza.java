package DesignPattern.factory.factorymethod.pizzastore.order;

import DesignPattern.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import DesignPattern.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import DesignPattern.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("Cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        } else if (pizzaType.equals("Pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }
}
