package toppings;

import pizza.*;

public class Tomatoes extends Pizza
{
    Pizza pizza;

    public Tomatoes(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Tomatoes ";
    }
    public int getCost() {
        return 10 + pizza.getCost();
    }
}
