package DesignPattern.factory.factorymethod.pizzastore.order;

import DesignPattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import DesignPattern.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import DesignPattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public abstract Pizza createPizza(String pizzaType);

    public OrderPizza() {
        do {
            String pizzaType = getType();
            Pizza pizza = createPizza(pizzaType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
