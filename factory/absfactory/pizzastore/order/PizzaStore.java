package DesignPattern.factory.absfactory.pizzastore.order;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
    }
}
