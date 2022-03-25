import enms.PizzaType;
import enms.ToppingType;
import pizza.*;

import java.util.Observable;
import java.util.Observer;

public class PizzaFactory implements Observer{

    private static PizzaFactory uniqueInstance;
    PizzaType pizzaTypes;
    ToppingType toppingTypes;
    public Observer observer;

    private PizzaFactory() {

    }

    public static PizzaFactory instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactory();
        }
        return uniqueInstance;
    }

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CAPRICIOSA:
                return new Capriciosa();
            case PROSCIUTTO_FUNGHI:
                return new ProsciuttoFunghi();
            case QUATRO_STAGIONI:
                return new QuatroStagioni();
            case MARGUERITA:
                return new Marguerita();
        }
        return null;
    }

    public void setPizzaTypes() {
        this.pizzaTypes = pizzaTypes;
    }
    public void attachObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}

class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 0;
    }
}