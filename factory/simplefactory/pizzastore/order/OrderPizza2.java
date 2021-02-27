package DesignPattern.factory.simplefactory.pizzastore.order;

import DesignPattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import DesignPattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import DesignPattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {

    public OrderPizza2() {
        String pizzaType = "";
        Pizza pizza = null;
        do {
            pizzaType = getType();
            pizza = SimpleFactory.createPizza2(pizzaType);
            if (pizza == null) {
                System.out.println("订购披萨失败");
                break;
            } else {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
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
