package DesignPattern.factory.simplefactory.pizzastore.order;

import DesignPattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import DesignPattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import DesignPattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (type.equals("Cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }

    public static Pizza createPizza2(String type) {
        Pizza pizza = null;
        if (type.equals("Greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (type.equals("Cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
