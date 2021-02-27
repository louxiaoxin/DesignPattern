package DesignPattern.factory.absfactory.pizzastore.order;

import DesignPattern.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    Pizza createPizza(String pizzaType);
}
