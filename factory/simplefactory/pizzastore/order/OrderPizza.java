package DesignPattern.factory.simplefactory.pizzastore.order;

import DesignPattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import DesignPattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import DesignPattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    private SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    private void setFactory(SimpleFactory simpleFactory) {
        String pizzaType = "";
        this.simpleFactory = simpleFactory;
        do {
            pizzaType = getType();
            Pizza pizza = this.simpleFactory.createPizza(pizzaType);
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

    public OrderPizza() {
        do {
            String pizzaType = getType();
            Pizza pizza = null;
            if (pizzaType.equals("Greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (pizzaType.equals("Cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }
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
