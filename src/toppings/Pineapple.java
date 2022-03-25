package toppings;

import pizza.*;

public class Pineapple extends Pizza
{
    Pizza pizza;
    public Pineapple(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Pineapple ";
    }
    public int getCost() {
        return 15 + pizza.getCost();
    }
}
